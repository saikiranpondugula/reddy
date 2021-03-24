package threads;

public class Saikiranreddy implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("saikiran");
		
	}
	public static void main(String args[])
	{
		Saikiranreddy sd = new Saikiranreddy();
		sd.run();
	}

}
