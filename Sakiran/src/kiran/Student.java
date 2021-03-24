package kiran;

import java.util.Scanner;

public class Student {
static boolean isspace(int marks[]) {
	boolean b = true;
	int count = 0;
	for(int i = 0 ;i<marks.length;i++) {
		if(marks[i]>35) {
			count++;
		}
	}
	if(count == marks.length) {
		b = true;
	}
	return b;
}
static int calTotal (int marks[]) {
	int sum = 0;
	for(int x :marks) {
		sum+= x;
	}
	return sum;
}
static String findgrade(int marks[]) {
	String res ="";
	if(isspace(marks)) {
		res +="passed \n";
		int total = calTotal(marks);
		int avg = total/marks.length;
		res +="ur total marks = "+total+"\n";
		res +="Average marks = "+avg+"\n";
		if(avg>=75) {
			res+="you get the distinction\n";
		}
		else if(avg>=60){
			res+="you get the first class\n";
		}
		else if(avg >=50) {
			res+="you got the second class\n";
		}
		}
	else {
		res = "failed & try  again";
	}
	return res;
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the subject marks");
	int marks[] = new int[5];
	for(int i =0;i<marks.length;i++) {
		marks[i] = sc.nextInt();
	}
	System.out.println(findgrade(marks));
}	
}

