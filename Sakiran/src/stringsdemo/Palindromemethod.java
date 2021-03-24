package stringsdemo;

import java.util.Scanner;

public class Palindromemethod {
    static String checkPalindrome (String name) {
    	String res = "";
		for(int i = name.length()-1; i >=0; i--) {
			res += name.charAt(i);
		}
		if(name.equals(res)) {
			return "palindrome";
		}
		else {
			return "not a palindrome";
		}
}
	public static void main(String[] args) {
		String res = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the palindrome name");
        System.out.println(checkPalindrome(sc.next()));
	}
}
