package threads;

public class Sai extends Thread
{
	public void run()
	{
		System.out.println("saikiran");
	}
	public static void main(String args[])
	{
		Sai df = new Sai();
		df.start();
		System.out.println("the thread is start in outlook");
	}
}
