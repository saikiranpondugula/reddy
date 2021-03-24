package threads;

public class Saikiranreddy1 extends Thread
{
	public void krishna()
	{
		System.out.println("saikiran");
	}
	public static void main(String args[])
	{
	/*{
		Saikiranreddy1 sd = new Saikiranreddy1();
		sd.run();
		for(int i = 0;i<=10;i++)
		{
			System.out.println("sai");
		}
		sd.currentThread();
		sd.krishna();
	}*/
	Runnable task = () -> {
	    String threadName = Thread.currentThread().getName();
	    System.out.println("Hello " + threadName);
	};
	task.run();
	Thread thread = new Thread(task);
	thread.start();
	System.out.println("Done!");
}
}
