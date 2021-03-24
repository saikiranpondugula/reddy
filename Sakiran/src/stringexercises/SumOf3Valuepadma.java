package stringexercises;

import java.util.Scanner;

public class SumOf3Valuepadma {
	static int luckySum(int a, int b, int c) {

		if(a == 13) {
			return 0;
		}
		else if(b == 13) {
			return a;
		}
		else if(c == 13) {
			return a + b;
		}
		else {
			return a + b + c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Number");
		System.out.println(luckySum(sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}

}
