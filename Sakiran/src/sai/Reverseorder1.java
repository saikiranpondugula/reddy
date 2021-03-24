package sai;

import java.util.Scanner;

public class Reverseorder1 {
	static int findSmall(int nums[]) {
		int small = nums[0];
		for(int i = 1;i<nums.length;i++) {
			if(nums[i] < small) {
				small = nums[i];
			}
		}
	return small;
	}
	public static void main(String args[]) {
		int number[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 5 values ");
		for(int i = 0;i< number.length;i++) {
			number[i] = sc.nextInt();
		}
		System.out.println("smallest of values = "+findSmall(number));
	}
}
