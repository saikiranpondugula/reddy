package kiran;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String arga[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		int iteration = 4;
		String left ="";
		String right = "";
		String spaces = "          ";
		for(int i = 1; i <= iteration; i++) {
			System.out.print(spaces.substring(0, iteration - i));
			System.out.println(left + i + right);
			left += i;
			right = i + right;
		}
	}
}
