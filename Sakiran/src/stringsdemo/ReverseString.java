package stringsdemo;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = "kiran";
		String res = "";
		for(int i = name.length()-1; i >=0; i--) {
			res += name.charAt(i);
		}
		System.out.println(res);
		
	}

}
