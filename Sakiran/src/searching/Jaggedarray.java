package searching;

import java.util.Scanner;

public class Jaggedarray {
	static void display(int cse[][]) {
		for(int i =0; i< cse.length; i++) {
			for(int j=0; j<cse[i].length; j++) {
				System.out.print(cse[i][j] + " ");
			}
			System.out.println();
	}
	}
	public static void main(String args[]) {
		int[][] cse = new int [3][];
		cse [0] = new int[4];
		cse[1] = new int [5];
		cse[2] = new int [3];
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter " + cse.length + " students info..:");
	        for(int i = 0;i < cse.length;i++) {
	            System.out.println("Enter " + (i ) + " student " + cse[i].length + " sub marks:");
	            for(int j = 0; j < cse[i].length;j++) {
	                cse[i][j] = sc.nextInt();
	            }
	        }
	        display(cse);
	}
}