package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] a){
		
		Person p1=new Person("MayurD",1);
		Person p2=new Person("MayurS",2);
		
		ArrayList<String> list=  new ArrayList<String>();
		list.add("B");
		list.add("A");
		
		showSortShow(list);
		
		System.out.println(list.get(0));
		
		
		List personList=new ArrayList<Person>();
		personList.add(p2);
		personList.add(p1);
		
		//showSortShow(personList);
		
		//using Comparator interface
		/*System.out.println("Using Comparator");
		Comparator py=new PersonNoCompare();
		Collections.sort(list,py);		
		System.out.println(list);*/
		
		
		
		Iterator<Person> itr= personList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().getName());
		// 	personList.add(p1);   ConcurrentModificationException
		}
	
	}
	
	public static void showSortShow(List list){
		System.out.println(list);
		Collections.sort(list);		
		System.out.println("After SOrt "+list);
	}
	
	public static void listToArray(List list){
		Object[] a=list.toArray();
		
		for(Object o:a){
			System.out.println(o);
		}
	}
		
		public static void arrayToList(Object[] arr){
			List list=Arrays.asList(arr);
			for(Object o:list){
				System.out.println(o);
			}
		
		}
		
	
	
}

