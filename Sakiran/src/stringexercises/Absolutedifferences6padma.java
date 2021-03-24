package stringexercises;

import java.util.Scanner;

public class Absolutedifferences6padma {
	
		static int diff21(int number) {
			if (number < 21) {
				return 21 - number;
			} else if (number >= 21) {
				return ((number - 21) * 2);

			}
			return number;
		}		
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	System.out.println(diff21(sc.nextInt()));
}
}
