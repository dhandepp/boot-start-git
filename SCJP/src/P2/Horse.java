package P2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Horse extends Animal {
	
	public Horse()
	{
		super(2);
		System.out.println("Horse");
	}
	public Horse sendAnimal(int d,int... x)
	{
		System.out.println("d is "+d+" ");
		for(int temp: x){
			System.out.println(temp+" ");
		}
		
		Animal a=new Animal(2);
	System.out.println("ab is invalid"+a.ab);
		
		System.out.println("Horse");
		return null;
		
	}
	
	public static void main(String[] a)
	{
	
		StringBuffer sb=new StringBuffer("s");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		
		new Horse().sendAnimal(1,2,3);
	}
	

}
