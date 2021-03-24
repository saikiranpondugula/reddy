package sai;

import java.util.Scanner;

public class Reverseorder {
	static int findBig(int nums[]) {
		int big = 0;
		for(int i = 1;i<nums.length;i++) {
			if(nums[i] > big) {
				big = nums[i];
			}
		}
	return big;
	}
public static void main(String args[]) {
	int number[] = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the 5 values ");
	for(int i = 0;i< number.length;i++) {
		number[i] = sc.nextInt();
	}
	System.out.println("Biggest of values = "+findBig(number));
}
}
