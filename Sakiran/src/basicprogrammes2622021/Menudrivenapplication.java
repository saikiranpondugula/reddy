package basicprogrammes2622021;

import java.util.Scanner;

public class Menudrivenapplication 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		String menu = "menu Driven application\n";    
		menu += "welcome\n";
		menu += "addition\n";
		menu += "subtraction\n";
		menu += "multiplication\n";
		menu +="division\n";
		System.out.println(menu);
		String  res = "";
		int choice  = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("entert the two numbers");
		res = "sum"+(sc.nextInt()+sc.nextInt());
		break;
		case 2:
			System.out.println("entert the two numbers");
		res = "sum"+(sc.nextInt()-sc.nextInt());
		break;
		case 3:
			System.out.println("entert the two numbers");
		res = "mul"+(sc.nextInt()*sc.nextInt());
		break;
		case 4:
			System.out.println("entert the two numbers");
		res = "div"+(sc.nextInt()/sc.nextInt());
		break;
		case 5:
			System.out.println("entert the two numbers");
		res = "mod"+(sc.nextInt()%sc.nextInt());
		break;
		default :
			res = "invalid option";
		}
		System.out.println(res);
	}
	}
}
