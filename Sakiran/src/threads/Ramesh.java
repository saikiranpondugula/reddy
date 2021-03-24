package threads;

public class Ramesh extends Thread
{
	 public static int amount = 2;
 public static void main(String[] args) 
 {
	Ramesh thread = new Ramesh();
    thread.start();
    System.out.println(amount);
    amount++;
    amount= amount+1;
    System.out.println(amount);
  }
  public void run() 
  {
    amount++;
  }
}
