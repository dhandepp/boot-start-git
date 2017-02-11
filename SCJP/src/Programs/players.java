package Programs;

import java.util.Random;
import java.util.Scanner;

public class players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		String s="";
		int i=1;
		while(i<=38){

s=s+",("+i+","+(int )(Math.random() *  + 75)+","+(int )(Math.random() * 90 + 75)+","+(int )(Math.random() * 90 + 75)+","+(int )(Math.random() * 90 + 75)+","+(int )(Math.random() * 90 + 75)+")";
i++;
	}
		System.out.println(s);
	}
}
