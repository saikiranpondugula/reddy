package searching;

import java.util.Scanner;

public class Student1 {
	static	void listStudentsMarks(String studs[][]) {
		for(int i = 0; i< studs.length; i++) {
			for(int j = 0;j <studs[i].length;j++) {
				System.out.print(studs[i][j] +" ");
		}
		System.out.println();
		}
	}
	public static void main (String args[]){
		String studs[][] = new String [3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the names in it");
	        int k = 0;
		for(int i = 0; i< studs.length; i++) {
			for(int j = 0;j <studs[i].length; j++) {
				studs[i][j] = sc.next();
				k++;
			}
		}
		listStudentsMarks(studs);
	}
}
