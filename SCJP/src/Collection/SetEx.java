package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("MayurD",1);
		Person p2=new Person("MayurS",2);
		Person p3=new Person("MayurD",1);
		
		//HashSet unsorted unordered
		HashSet  s=new HashSet<Person>();
		s.add(p3);

		s.add(p2);
		s.add(p1);
		s.remove(p1);
		
		for(Object p : s)
		{
			System.out.println(p);
		}
		
		
		System.out.println();
		
		// TreeSet sorted
		
		TreeSet t=new TreeSet();
		// t.add(new Integer(42));
	//	t.add(new Object());
	
		t.add(p2);
		t.add(p1);
	
		
		for(Object s1 : t)
		{
			System.out.println(s1);   // Prints A and S
		} 
		
		
		LinkedHashSet linkedSet=new LinkedHashSet();
	//	linkedSet.
		
	}

}
