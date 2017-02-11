package multithreading;

import java.io.Serializable;

public class Internet
{
	public static void main(String[] args)
{
	Browser browser=new Browser();
	Server server=new Server();
	
	
	Thread runBrowser=new Thread(browser,"Browser1");
	//Thread runBrowser1=new Thread(browser,"Browser2");
	
	runBrowser.start();
//	runBrowser1.start();
}

	
	
}

class Browser implements Runnable {
	
	public void render()
	{
		Server server=new Server();
		Thread runServer=new Thread(server,"Server");
		runServer.start();
		
	//	System.out.println("Waiting "+Thread.currentThread().getName());
		
		synchronized(server){
			System.out.println("Waiting for server to generate bytes");
			try {
				server.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Total bytes generated are "+server.getTotalBytes());
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		render();
		
	}
	
}

class Server implements Runnable, Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int totalBytes;
	
	public int getTotalBytes()
	{
		return totalBytes;
	}
	
	public void serve()
	{
		synchronized(this){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	for(int i=0;i<100;i++)
	{
		totalBytes++;
	}

	notify();
	
		}
	}

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		serve();
	}
	
	
	
	}