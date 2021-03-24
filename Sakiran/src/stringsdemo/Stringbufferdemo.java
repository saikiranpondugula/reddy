package stringsdemo;

import java.util.Scanner;

public class Stringbufferdemo {
	static String checkPalindrome(String  name) {
		String result = "";
		StringBuffer sc = new StringBuffer(name);
		result  = sc.reverse().toString();
		if(result.equals(name)) {
			return "palindrome";
		}                                                                                                                                                                                                    
		else {
			return "not a palindrome";
		}
	}
	public static void main(String[] args) {
		Scanner scd = new Scanner(System.in);
		System.out.println("enter the names ?");
		System.out.println(checkPalindrome(scd.next()));
	}
}
