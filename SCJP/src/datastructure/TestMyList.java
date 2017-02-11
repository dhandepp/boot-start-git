package datastructure;


public class TestMyList{
	
	public static void main(String[] a){
		
		MyList<Integer> list=new MyList<Integer>();
		Node<Integer> node=new Node<Integer>();
		node.setData(1);
		
		Node<Integer> node2=new Node<Integer>();
		node2.setData(2);
		
		
		list.addFirst(node);
		list.addFirst(node2);
		
	}
	
}


 class MyList<T> {
private Node<T> head;
private Node<T> tail;

public void addFirst(Node<T> node)
{
	if(head==null && tail==null)
	{
head=node;
tail=node;
}
	else
	{
		Node temp=head;
		head.setNext(node);
		node.setNext(temp);
		temp.setPrev(node);
		tail.setPrev(temp);
	}
	
	System.out.println("Head is NP "+head.getNext()+" "+head.getPrev());
	System.out.println("Tail is NP "+tail.getNext()+" "+tail.getPrev());
	System.out.println("My node is "+node.getData()+" next is "+node.getNext()+" on previous is "+node.getPrev());;
	
	
}
}

class Node<T>
{
	private Node<T> next;
	private Node<T> prev;
	private T data;
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public Node<T> getPrev() {
		return prev;
	}
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
		
}