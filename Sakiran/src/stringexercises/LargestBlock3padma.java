package stringexercises;

import java.util.Scanner;

public class LargestBlock3padma {
	static int maxBlock(String str) {
		String res = "";
		int length = str.length();
		int tcount = 0;
		int count = 0;

		if (length == 0) {
			return 0;
		}

		for (int i = 0; i < length; i++) {
			if (i < length - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				count = 1;
			}
			if (count > tcount)
				tcount = count;
		}
		return tcount;
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		System.out.println(maxBlock(sc.next()));
	}
}
