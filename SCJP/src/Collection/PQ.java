package Collection;

import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Mayur";
		char c;
		PriorityQueue pq=new PriorityQueue<String>();
		
		for(int i=0;i<a.length();i++)
		{
			 c=a.charAt(i);
			pq.offer(c);
		}
		
		for(int i=0;i<a.length();i++)
		{
			System.out.println(pq.poll());
		}
		
		
	}

}
