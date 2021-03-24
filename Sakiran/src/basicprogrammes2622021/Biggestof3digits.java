package basicprogrammes2622021;

public class Biggestof3digits 
{
	public static void main(String args[])
	{
		String ers= "";
		if(args.length!=3)
		{
			ers+="invalid arguments\n";
			ers+="enter the valid inputs";
			System.out.println(ers);
			return;
		}
		int number = Integer.parseInt(args[0]);
		int number1 = Integer.parseInt(args[1]);
		int number2 = Integer.parseInt(args[2]);
		
		if(number>number1)
			if(number>number2)
			{
				ers = number + "is big number";
			}
			else {
				ers = number2 + "is  big number";
				}
			
		else if(number1>number2)
		{
			ers = number1 +"is big number";
		}
		else{
			ers = number2 +"is bigg number";  			
		}	
		System.out.println(ers);
	}
}
