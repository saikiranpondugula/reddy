package threads;

public class Saikiran implements Runnable
{
	public void saturn() {
		System.out.println("sai kiran reddy" );
	}
	@Override
	public void run()
	{
		System.out.println("sai kiran reddy" );	
	for(int i = 0;i <5;i++ )
	{
		System.out.println("sai");
	}
	}
	public static void main(String args[])
	{
		Saikiran er = new Saikiran();
		er.toString();
		er.run();
		er.saturn();
	}
}
