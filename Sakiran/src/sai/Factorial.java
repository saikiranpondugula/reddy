package sai;

public class Factorial {
	static int findFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		else {
			return num * findFactorial(num -1 );
		}
	}
	public static void main(String[] args) {
	System.out.println(findFactorial(5));
	}

}
