package arrays;

import java.util.Scanner;

public class Naturalnumberrecursion2 {
	static int naturalnumber (int number,int number1) {
		if(number == number1)
			return number1;
		return number + naturalnumber(number+1, number1);
	}
public static void main(String args[]) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("enter the values in natural number");
	int number = sc.nextInt();
	int number1 = sc.nextInt();
	System.out.println(naturalnumber(number, number1));
    }
}

