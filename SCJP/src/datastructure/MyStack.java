package datastructure;

public class MyStack {
	private int top;
	private int[] myStack;
	private int maxSize;
	
	public MyStack(int size){
		this.top=-1;
		this.myStack=new int[size];
		maxSize=size;
	}
	
	public void push(int val)
	{
		myStack[++top]=val;
	}
	public long pop(){
		return myStack[top--];
	}
	
	public boolean isStackEmpty(){
		return (top==-1);
	}
	
	public boolean isStackFull()
	{
		return (maxSize-1==top);
	}
	
	public void showStack(){
		for(int i=0;i<=top;i++)
		{
			System.out.print(myStack[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyStack stack1=new MyStack(10);
	stack1.push(10);
	stack1.push(20);
	stack1.push(40);
	stack1.push(60);
	
	stack1.showStack();
	
	stack1.pop();
	stack1.pop();
	stack1.pop();
	
	System.out.println();
	stack1.showStack();
	
	
	System.out.println();
	for(int i=0;i<stack1.maxSize;i++)
	{
		System.out.print(stack1.myStack[i]+" ");
	}
	
	}

}
