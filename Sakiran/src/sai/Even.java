package sai;

import java.util.Scanner;

public class Even {
static String even(int nums[]) {
	String res ="";
	for(int i=0;i<nums.length;i++) {
		if(nums[i] % 2 ==0) {
			res += nums[i] + " ";
		}
	}
	return res.substring(0 , res.length()-1);
}
public static void main(String args[]) {
	int number[] = new int[5];
	Scanner sd = new Scanner(System.in);
	System.out.println("enter the 5 values");
	for(int i = 0;i< number.length;i++) {
		number[i] = sd.nextInt();
	}
	System.out.println("reverse order");
	for(int x: (number))
	{
		System.out.println();
	}
}
}
