package datastructure;
public class MyQueue<T> {

    private T[] arr;

    private int total, read, write;

    public MyQueue(int size)
    {
        arr = (T[]) new Object[size];
        total=size;
            }

   
    public void enqueue(T ele)
    {
    	
        if(write==total && read!=0)
        {
        	write=0;
        	arr[write++]=ele;
        }
        else if(read==0 && write==total)
        {
        	System.out.println("No space");
        }
        else
    	arr[write++]=ele;
        
        
        
    }

    public T dequeue()
    {
    	if (read == write) 
    	{
            System.out.println("Empty queue");
    	return null;
    	}
    	
    	return arr[read++];
   	
    }

    public void printDQ()
    {
    	
    	if(write==read){
        System.out.println("Empty list");
        	}
        	
    	else if(write>read){
    		for(int i=read;i<write;i++)
        	{
        		System.out.print(arr[i]+" ");
        	}
    		System.out.println();
    	}
    	else
    	{
    		for(int i=0;i<write;i++)
        	{
        		System.out.print(arr[i]+" ");
        	}
    	for(int i=read;i<total;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	
    	System.out.println();
    	}
    	
    }
    
    

    public static void main(String a[])
    {
    	MyQueue<Integer> queue=new MyQueue<>(10);
    	queue.enqueue(10);
    	queue.enqueue(20);
    	queue.enqueue(30);
    	queue.enqueue(40);
    	queue.enqueue(50);
    	queue.enqueue(60);
    	queue.enqueue(70);
    	queue.enqueue(80);
    	queue.enqueue(90);
    	queue.enqueue(100);
    	
    	
    	queue.printDQ();
    	
    	queue.dequeue();
    	queue.dequeue();
    	queue.dequeue();
    	
    	queue.printDQ();
    	
    	queue.enqueue(110);
    	queue.enqueue(120);
    	
    	queue.printDQ();
    }
    
}