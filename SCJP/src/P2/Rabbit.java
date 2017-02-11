package P2;

import P1.Cat;

public abstract class Rabbit extends Cat {

	public abstract void do1();
	
public void test()
{
	
	}

//implementing abstract method 
public void temp(){}
}


class Jaguar extends Rabbit
{
	public void Jaguar()
	{
		int x = 0;
		System.out.println("in void jaguar "+x);
	}
	public Jaguar()
	{
		System.out.println("Real constructer");
	}
	@Override
	public void do1() {
		// TODO Auto-generated method stub
		
	}
}
