package basicprogrammes2622021;

public class Biggestoftwodigits 
{
	public static void main(String args[])
	{
		String ers= "";
		if(args.length!=2)
		{
			ers+="invalid arguments\n";
			ers+="enter the valid inputs";
			System.out.println(ers);
			return;
		}
		int number = Integer.parseInt(args[0]);
		int number1 = Integer.parseInt(args[1]);
		if(number>number1)
		{
			System.out.println(number+" is big number");
		}
		else {
			System.out.println(number1+" is big number");
		}
		if(number == number1)
		{
			System.out.println("both are equal");
		}
		}
}
