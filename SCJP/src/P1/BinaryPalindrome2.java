package P1;

import java.io.Console;
import java.util.Scanner;

public class BinaryPalindrome2 {
	static long a,b,recNum;
	static long longLog;
	static long i;
	
	public static void main(String args[]){
		 Scanner in = new Scanner(System.in);
			int n =10;
			int ar[] = new int[n];
			
			for (int i = 0; i < n; i++) {
				ar[i] = in.nextInt();
			}
			
			for(int i=0;i<n;i++){
				System.out.println(getNthBinaryPalindrome(ar[i]+1));
			}
		
	}
	
	
	public static long getNthBinaryPalindrome(long num){
		
		if(num==1)
			return 0;
		else if(num==2)
			return 1;
		else if(num==3)
			return 3;
		
		long numLog=flog2(num-1);
		long gtNumLog=1<<numLog;
		long lt=gtNumLog>>1;
		long gt=gtNumLog<<1;
		
		if(num==gt){
			a=0;
			b=0;
			recNum=1;
		}
		else if(gtNumLog < num && num<lt+gtNumLog){
			i=num-gtNumLog;
			longLog=flog2(i);
			a=numLog-longLog-1;
			b=2;
			recNum=(1<<longLog)+i;
		}
		else if(num==lt+gtNumLog){
			a=0;
			b=1;
			recNum=1;
		}
		else{
			i=num-lt-gtNumLog;
			longLog=flog2(i);
			a=numLog-longLog-1;
			b=1;
			recNum=(2<<longLog)+i;
		}
			
		long result= (1 << (2*numLog - b)) + 1 + (1 << a) * getNthBinaryPalindrome(recNum);
		return result;
	}
	
	public static long flog2(long n){
		return (long) (Math.floor(Math.log(n)/Math.log(2)));

	}
}
