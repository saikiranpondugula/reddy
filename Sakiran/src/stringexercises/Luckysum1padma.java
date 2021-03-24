package stringexercises;

import java.util.Scanner;

public class Luckysum1padma {
	static int luckySum(int sum, int number2, int number3) {
		 sum = sum + number2 + number3;
		//System.out.println(sum);
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the numbers in a,b,c values ");	
		int sum = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		System.out.println(luckySum(sum,number2,number3));
		}
	}

