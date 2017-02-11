package P1;

import java.util.Scanner;

public class TempLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
			
		int n = in.nextInt();
		int j;
		int counter=0;
		long initiate=257;
		while(initiate<512){
			
			String binaryNumber=Long.toBinaryString(initiate);
			
			StringBuilder reversedNumber=new StringBuilder();
			reversedNumber.append(binaryNumber);
			reversedNumber=reversedNumber.reverse();
			
			
			//Method #1 starts here
			// next value for pallindrome test is in queue
			initiate+=2;
			
			if(binaryNumber.equals(reversedNumber.toString()))
					{
				
					System.out.println("P is "+(initiate-2)+" "+reversedNumber);
							// got one pallindrome
						counter++;	
						
				// have we found nth pallindrome
						if(counter==n)
						{
							System.out.println("Nth pallindrome is "+ (initiate-2) +" with binary value "+reversedNumber);
							break;
						}	
					}
			/* Method 1 ends here  */
			
			
			
		}
	}

}
