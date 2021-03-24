package kiran;

public class Checkpalindrome {
static boolean cheack(int number) {
	boolean b = false;
	int rem = 0,rev = 0,temp = number;
	while(number > 0 ) {
		rem = number % 10;
		rev = (rev*10) + rem;
		number = number / 10;
	}
	if(temp == rev) {
 b = true;
	}
	return b;
}
public static void main(String args[]) {
	System.out.println(cheack(91019));
}
}
