package basicprogrammes2622021;


public class Evenoroddnumber 
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
        if(args.length != 1)
        {
            System.out.println("invalid arg");
            System.out.println("enter one num");
             return ;
        }
        int rem = num % 2;
        switch(rem) 
        {
        case 0 :
            System.out.println(num + " is Even  number");
            break;
        case 1 :
            System.out.println(num + " is  Odd number");
            break;
        }
	}
}
