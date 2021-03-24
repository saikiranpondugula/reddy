package threads;

public class Dj  extends Thread
{
	public void jhansi() 
	{
		System.out.println("jahnsi is studying");
	}
	public void krishna() 
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) throws InterruptedException
	{
		Dj sd = new Dj();
		Dj df = new Dj();
		sd.run();
		sd.setName("saikrian");
		System.out.println("Name of t1:"+sd.getName()+df+sd);
		System.out.println(sd);
			sd.jhansi();
			sd.krishna();
	}
}
