package threads;

public class Rushi implements Runnable
{
	@Override
	public void run() 
	{
		int n = 8; // Number of threads
        for (int i = 0; i < n; i++) 
        {
            System.out.println("saikiran");
        }
	}
public static void main(String args[])
{
	System.out.println("sai");
	Rushi ssd =  new Rushi();
	ssd.run();
}
}
