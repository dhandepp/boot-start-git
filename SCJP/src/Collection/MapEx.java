package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Object,Object> m=new HashMap<Object,Object>();
		m.put("k1",new Person("MayurS",1));
		m.put("k2","MayurD");
		m.put("k2","MayurD3");
		Person p=new Person("ThirdP",3);
		m.put(p,"Some Third Person");
		
		Person p1=new Person("OhirdP",1);
		m.put(p1, "Some P person");
		m.put(null, p1);
		
	int a='A'+'B';
	System.out.println(a);
		
		System.out.println(m.get("k1"));
		System.out.println(m.get("k2"));
		System.out.println(m.get(new Person("ThirdP",4)));
		
		System.out.println(m.get(null));
		
		
		System.out.println();
		
		for(Map.Entry<Object, Object> entry:m.entrySet())
		{
			
		}
		
		
		
		/*LinkedHashMap lmap=new LinkedHashMap<Person,Object>();
		lmap.re*/
		
		/*Hashtable ht=new Hashtable<Person,Object>();
		ht.put(p1, "Asd");
		System.out.println(ht.get(p1));*/
		
		
	//	System.out.println(m.get(p1));
		
	}

}
