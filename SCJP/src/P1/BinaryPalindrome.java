package P1;

import java.util.Scanner;

/*Awful method */
public class BinaryPalindrome {
	
	public static void main(String[] a){

		 Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int j;
			int counter=0;
			long initiate=1;
			while(true){
				
				String binaryNumber=Long.toBinaryString(initiate);
				
				StringBuilder reversedNumber=new StringBuilder();
				reversedNumber.append(binaryNumber);
				reversedNumber=reversedNumber.reverse();
				
				
				//Method #1 starts here
				// next value for pallindrome test is in queue
				initiate+=2;
				
				if(binaryNumber.equals(reversedNumber.toString()))
						{
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
				
				
				
				
				
				
				
				/* 	Method #2 starts here  	*/
				
				/*//checking if its a pallindrome
				for(j=0;j<reversedNumber.length();j++)
				{
					if(binaryNumber.charAt(j)!=reversedNumber.charAt(j))
					{
					//	System.out.println("Aint same "+binaryNumber +" r is "+reversedNumber);
						break;
					}
				}
				
				// Going on next value to check
				initiate=+2;
				
				// is Pallindrome ?
				if(j==reversedNumber.length())
					{
					
					//Got one some of bitch, increasing our counter
				//	System.out.println("Same "+binaryNumber +" r is "+reversedNumber);
					counter++;
				
					
					// have we found nth pallindrome
							if(counter==n)
							{
								System.out.println("Nth pallindrome is "+ (initiate-2)+" with binary value "+reversedNumber);
								break;
							}	
					}
							Method 2 ends here 		*/
				
						
					}
	}

	
}
