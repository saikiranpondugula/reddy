package stringexercises;

import java.util.Scanner;

public class Sum_Of_Value_Teen_Range1padma {
	public static int noTeenSum(int number1, int number2, int number3) {
		return fixTeen(number1) + fixTeen(number2) + fixTeen(number3);
	}

	public static int fixTeen(int n) {
		if ((n >= 13 && n < 15) || (n > 16 && n <= 19)) {
			return 0;
		} 
		else {
			return n;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Number");
		System.out.println(noTeenSum(sc.nextInt(), sc.nextInt(), sc.nextInt()));

	}
}
