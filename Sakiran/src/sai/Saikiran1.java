package sai;

import java.util.Scanner;

public class Saikiran1 {
	static void dispMarks(int marks[]) {
		int sum = 0 ;
		System.out.println("marks as follows");
		for(int x : marks) {
			System.out.println(x);
			sum = sum + x;
		}
		System.out.println("sum of marks :" +sum);
	}
	public static void main(String args[]) {
		int marks[] = {10,20,30,40,50};
		dispMarks(marks);
	}
}
