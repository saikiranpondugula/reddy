package sai;

import java.util.Scanner;

public class Saikiran {
static void dispMarks(int marks[])
{
	int sum = 0;
	System.out.println("marks as follows");
	for(int  i= 0;i< marks.length;i++) {
		System.out.println(marks[i]);
		sum = sum + marks[i];
	}
	System.out.println("sum of marks:" + sum);
}
public static void main(String args[]) {
	int marks[] = new int[5];
System.out.println("enter" + marks.length + "submarks ?");
Scanner sc = new Scanner(System.in);
for(int i=0;i<marks.length;i++) {
	marks[i] = sc.nextInt();
}
dispMarks(marks);
}
}
