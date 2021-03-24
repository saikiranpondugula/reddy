package searching;

import java.util.Scanner;

public class Demo1 {
	static void display(int college[][][]) {
		for(int i = 0;i<college.length;i++) {
			for(int j =0;j<college[i].length;j++) {
				for(int k =0;k<college[i][j].length;k++) {
					System.out.print(college[i][j][k]+"\n");
				}
			}
			System.out.println();
		}
		
	}
public static void main(String args[]) {
	int college[][][] = new int [2][2][4];
	Scanner c= new Scanner(System.in);
	System.out.println("enter" + college.length + "info");
	for(int i =0;i<college.length;i++) {
		System.out.print("enter "+ (i + 1)+ "branch");
		for(int j =0;j<college[i].length;j++) {
			System.out.println(""+ (j+1) + "stud"
			+ college[i][j].length+"submarks");
			for(int k = 0;k<college[i][j].length;k++) {
				college[i][j][k] = c.nextInt();
			}
		}
	}
	display(college);
}
}
