package stringexercises;

import java.util.Scanner;

public class SumOfDigit0_2padma {
	static int sumDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isDigit(str.charAt(i))) {
				String temp = str.substring(i, i + 1);
				sum += Integer.parseInt(temp);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string char");
		System.out.println(sumDigits(sc.next()));
	}
}
