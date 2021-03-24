package basicprogrammes2622021;

import java.util.Scanner;

public class Fizzbizz
{

	public static void main(String args[])
	{
		Scanner ac = new Scanner(System.in);
		System.out.println("enter the mutiples of 3 or 5");
		int number = ac.nextInt();
		String res = "";
		if(number % 3 == 0 )
		{
			res = "fizz";
		}
		else if(number % 5 == 0)
		{
			res = "bizz";
		}
		else if(number % 3 == 0 && number % 5 ==0)
		{
			res= "fizzbizz";
		}
		else {
			res = "try again"; 
		}
		System.out.println(res);
	}
}
