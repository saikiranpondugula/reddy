package stringexercises;

import java.util.Scanner;

public class Amstrongnumber5 {
	
		static void palindromeOrNot(int number) {
			int temp = number;
			int sum = 0, rem = 0;
			while (number > 0) {
				rem = number % 10;
				number = number / 10;
				sum = sum + (rem * rem * rem);
			}
		
			if (temp == sum) {
				System.out.println(sum + ":  Armstrong Number");
			} else {
				System.out.println("  Not a Armstrong Number");
			}
		}

		public static void main(String[] args) {			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number for checking for Amstrong number");
			palindromeOrNot(sc.nextInt());

		}
}
