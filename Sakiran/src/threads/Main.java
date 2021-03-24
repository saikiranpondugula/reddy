package threads;

public class Main extends Thread
{
	public static int amount = 5;
	public static void main(String[] args) 
	{
	    Main thread = new Main();
	    thread.start();
	  
	    // Wait for the thread to finish
	   // if((thread.isAlive()))
	    {
	  //  System.out.println("Waiting...");
	  }
	  // Update amount and print its value
	  System.out.println("Main: " + ((amount+23)+8));
	  //amount++;
	 // System.out.println("Main: " + amount);
	  }
	  public void run() 
	  {
	   // amount++;
	  }
}
