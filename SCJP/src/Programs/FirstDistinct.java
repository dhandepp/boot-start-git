package Programs;

import java.util.Scanner;

public class FirstDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		char[] array=input.toCharArray();
		//char[] temp=new char[input.length()];
		String temp = null;
		
		for(int i=0;i<input.length();i++)
		{
			if(temp.indexOf((input.charAt(i)))>0){}
		}
		
	}

}
