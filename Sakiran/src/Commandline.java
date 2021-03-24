
public class Commandline 
{
	public static void main(String arg[])
	{
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);
		a += b;
		
		b = Integer.parseInt(arg[2]);
		a += b;
		 b =Integer.parseInt(arg[3]);
		 a += b;
		 System.out.println(a);
//		 System.out.println(b=a);
	}

}
