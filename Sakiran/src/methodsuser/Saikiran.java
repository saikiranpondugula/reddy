package methodsuser;

import java.util.Scanner;

public class Saikiran {//method with parameterised and return type
	//static void  display (int number,int number2)
	{
		//System.out.println("sum ="  +(number +number2));
	}
	static String display(int number, int number1)
	{
		return  "sum ="+(number + number1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values ");
		String nres = display(sc.nextInt(),sc.nextInt());
		System.out.println(nres);
	}
}
