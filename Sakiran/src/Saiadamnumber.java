import java.util.Scanner;

public class Saiadamnumber 
{
	public static boolean isAdamNumber(int num)
	{
	boolean b = false;
	int sqr1 = num * num;
	int result1 = getReverse(sqr1);
	int sqr2 = getReverse(num);
	int result2 = sqr2 * sqr2;
	if (result1 == result2) 
	{
		b = true;
	}
	return b;
}

public  static int  getReverse(int num) 
{
	int sum = 0;
	while (num > 0) {
		int rev = num % 10;
		sum = sum * 10 + rev;
		num = num / 10;
	}
	return sum;
}
public static void main(String[] args)
		{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number...");
	if (isAdamNumber(scanner.nextInt())) {
		System.out.println("the given number is Adam number");
	} 
	else 
	{
		System.out.println("the given number is  not Adam number");
	}
}
}
