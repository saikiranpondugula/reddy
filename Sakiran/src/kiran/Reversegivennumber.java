package kiran;

public class Reversegivennumber {
	static int reverse(int number) {
		int rem  =0 ;int rev= 0;
		while(number > 0) {
			rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
		}
		return rev;
	}
	public static void main(String args[]) {
		System.out.println("the reverse digit of give number is :"+reverse(2133));
	}

}
