package basicprogrammes2622021;

import java.util.Scanner;

public class Evennumberrange 
{
	public static void  main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Integer num1 = Integer.parseInt(args[0]);
		Integer num2 = Integer.parseInt(args[1]);
		String res = "";
		if (num1 < 1 || num2 < 1) 
		{
			res  =+ num1 + " is not a even number\nremaining are ";
		}
		for (int i = num1; i <= num2; i++)
		{
			//if (i % 2 == 0 && i > 0)
			if(i%2==0 )
			{
				res = res+ i + " ";
			}
		}
		System.out.println(res);
	}
}
