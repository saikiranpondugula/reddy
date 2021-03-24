package sai;

import java.util.Scanner;

public class Reverseoder2 {
	static int[] reverseArray(int nums[]) {
		int rev[] = new int [nums.length];
		int k = 0;
		for(int i = nums.length-1; i>=0; i--) {
			rev[k] = nums[i];
			k++;
		}
		return rev;
	}
public static void main(String  args[]) {
	int number[] = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the 5  values?");
	for(int i = 0; i<number.length; i++) {
		number[i] = sc.nextInt();
	}
	System.out.println("reverse order");
	for(int x: reverseArray(number)) {
	System.out.println(x);
	}
}
}

