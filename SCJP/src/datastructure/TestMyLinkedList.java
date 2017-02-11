/*package datastructure;

public class TestMyLinkedList<E> {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList<E> myList=new MyLinkedList<E>();
		

		TestMyLinkedList firstNode=new TestMyLinkedList();
		firstNode.pushFront(myList,10);
		
		
		
		System.out.println("My strucutre looks like "+myList);
		
		
	}
	
	public void pushFront(MyLinkedList<E> myList,E i)
	{
	
		LinkedNode<E> node=new LinkedNode<>();
		node.setNext(null);
		node.setPrev(myList.getHead());
		node.setData(i);
		
		myList.setHead(node);
		myList.setTail(node);
		
		myList.setSize(1);
		
		System.out.println("My node looks like "+node);
		
		
		LinkedNode<E> node2=new LinkedNode<>();
		node2.setNext(null);
		node2.setPrev(node.getNext());
		node2.setData(i);
		
		node.setNext(node2);
		myList.setTail(node2);
		
		System.out.println("My node looks like "+node2);
		
	}
	
	public void pushAfter(MyLinkedList<E> myList,E i){
	
		
		LinkedNode<E> node=new LinkedNode<>();
		node.setNext(null);
		node.setPrev(myList.getHead().getNext());
		node.setData(i);
		
		myList.getHead().setNext(node);
		myList.setTail(node);
		
		System.out.println("My node looks like "+node);
		
	}
	
	

}
*/