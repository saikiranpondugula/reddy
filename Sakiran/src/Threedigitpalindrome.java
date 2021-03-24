import java.util.Scanner;

public class Threedigitpalindrome 
{
	public static void main(String args[])
{
		 int number = 121;
		 int rem = number % 10;
		 System.out.println(rem);
		 int rev = number /100;
		 System.out.println(rev);
		 int d = rem+rev;
		 System.out.println(d);
		  boolean s = rem == rev;
		 // System.out.println(s);
}
}
