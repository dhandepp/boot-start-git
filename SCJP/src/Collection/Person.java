package Collection;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	
	private String name;
	private int no;
	
	public Person(String name,int no){
		this.name=name;
		this.no=no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", no=" + no + "]";
	}
	
	
/*	@Override
	public boolean equals(Object o)
	{
		
		System.out.println("Invoking equals");
		
		if(o instanceof Person && ((Person) o).no==this.no)
			return true;
		
			else
			return false;
	
	}*/
	
	public int compareTo(Person o)
	{
		/* int a=new Integer(no).compareTo(o.getNo());
		int b=name.compareTo(o.getName());
		
		if(a>0 && b>0)
			return 1;
		else if(a==0 && b==0)
			return 0;
		else
			return -1;*/
		
		
		return new Integer(no).compareTo(o.getNo());
		
	}

	/*@Override
	public int hashCode() {
		
		return name.length();
	}

	@Override
	public boolean equals(Object obj) {
		 if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		
	}*/
	


	
}





class PersonNoCompare implements Comparator<Person>{
	
	public int compare(Person a, Person b){
		return  new Integer(a.getNo()).compareTo(b.getNo());
	}
}
