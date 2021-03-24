package threads;

public class Main1  extends Thread
{
	public void run()
	{
		System.out.println("sai");
	}
	public static void main(String args[])
	{
		Main1 er = new Main1();
		er.currentThread();
		System.out.println(er.currentThread());
		er.isAlive();
		  if(er.isAlive())
		{
			System.out.println(er);
		}
		System.out.println(er);
	}
}
