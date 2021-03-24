package searching;

import java.util.Scanner;

public class Sumofarray {
	static void listStudentsMarks(int studs[][]) {
		for(int i = 0; i< studs.length; i++) {
			for(int j = 0;j <studs[i].length;j++) {
				System.out.print(studs[i][j] +"");
		}
		System.out.println();
		}
	}
	static int [] totalMarksOfEachStud(int studs[][]) {
	int total[] = new int [studs.length];
		for(int i = 0; i< studs.length; i++) {
			int tot =0;
			for(int  j = 0;j<studs.length;j++) {
				tot +=studs[i][j];
		}
			total[i] = tot;
			System.out.println();
		}
		return total;
	}
	
		public static void main(String args[]) {
			int studs[][] = new int[2][3];
			Scanner sc = new Scanner(System.in);
			System.out.println("enter"+studs.length+"stud marks");
			for(int i=0;i<studs.length;i++) {
				System.out.println((i+1)+"stud"+studs[i].length+"submarks?");
				for(int j =0;j<studs[i].length;j++) {
					studs[i][j] = sc.nextInt();
				}
 	}
}
}
