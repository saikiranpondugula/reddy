package kiran;

public class Threedigitnumber {
static	int noofDigits(int number) {
		int count = 0;
		while(number > 0) {
			int number1 = number % 10;
			count++;
		number = number /10;
		}
		return count;	
	}
	public static void main(String[] args) {
	System.out.println(noofDigits(15357));	
	}
}
