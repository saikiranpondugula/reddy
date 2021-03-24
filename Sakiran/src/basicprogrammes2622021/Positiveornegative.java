package basicprogrammes2622021;

public class Positiveornegative
{
	public static void main(String args[])
	{
		int number  = Integer.parseInt(args[0]);
		if(number<0)
		{
			number = - number;
		}
		System.out.println(number);
	}
}
