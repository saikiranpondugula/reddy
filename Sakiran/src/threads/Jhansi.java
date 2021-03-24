package threads;

public class Jhansi extends Thread
{
	public void run()
	{
	try
	{
        // Displaying the thread that is running
        System.out.println( "Thread " + Thread.currentThread().getName().strip().toLowerCase() + " is running");
    }
    catch (Exception e) 
	{
        // Throwing an exception
        System.out.println("Exception is caught");
    }
}
	public static void main(String args[])
	{
		int n = 10; // Number of threads
        for (int i = 0; i < n; i++) 
        {
            Jhansi obj= new Jhansi();
            obj.start();
        }
	}
}
