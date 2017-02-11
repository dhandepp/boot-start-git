package P1;

import java.io.IOException;

class Account{
	private double amount=50.0;

	public double getBalance() {
		return amount;
	}

	public void withdraw(double amount) throws IOException {
		/*throw new IOException();*/
	this.amount-=amount;
	}
	
}

public class AccountDanger implements Runnable {

	private Account acct=new Account();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountDanger r=new AccountDanger();
		
		Thread t1=new Thread(r,"MayurD");
		Thread t2=new Thread(r,"MayurS");
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			try {
				makewithdrawal(10);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(acct.getBalance()<10)
			{
				System.out.println("Account overdrawn.");
			}
		}
	}
	
	public synchronized void makewithdrawal(double amt) throws IOException
	{
		if(acct.getBalance()>=10)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdraw.");
		
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e) {}
		acct.withdraw(amt);
		System.out.println(Thread.currentThread().getName()+" completes withdrawal.");
		}
		else
		{
			System.out.println("Not enough in account for "
					+ Thread.currentThread().getName()
					+ " to withdraw " + acct.getBalance());
		}
	}

}
