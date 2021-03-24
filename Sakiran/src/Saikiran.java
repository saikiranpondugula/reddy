
public class Saikiran 
{
	public static void main(String args[])
	{
		int  number = Integer.parseInt(args[0]);
		int  rem = number % 10;
		int div = number / 10;
		System.out.println("the sum of two digits  :"+ (rem+div));
		System.out.println("the differences between two digits :"+(rem-(div)));
	}
}
