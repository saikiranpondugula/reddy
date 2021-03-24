package basicprogrammes2622021;

public class Evenorodd
{
	public static void main(String args[])
	{
	
		String res = "";
	if(args.length!=1)
	{
		res+="invalid arguments\n";
		res+= "enter the values ";
		System.out.println(res);
		return;
	}
	int  number = Integer.parseInt(args[0]);
	if(number % 2 == 0 )
	{
		res = number + " is even";
	}
	else {
		res = number + " is odd";
	}
	System.out.println(res);
	}
}
