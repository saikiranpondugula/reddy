package arrays;

import java.util.Scanner;

public class Linearsearch12 {
	static String linearsearh(int searchElement,int values[]) {
		String res = "";
		int count =0;
		for(int i = 0;i<values.length;i++) {
			if(searchElement == values[i]) {
				count = i;
				break;
			}
		}
		if(count  != 0) {
			res =" element are found "+(count+1);
		}
		else {
			res = "not found";
		}
		return res;
	}
	public static void main(String args[]) {
		int numbers []= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the search elements");
		System.out.println(linearsearh(sc.nextInt(),numbers));
}
}
