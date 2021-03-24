package kiran;

public class Palindromerange {
	static boolean checkpalindorme(int number) {
		boolean result = false;
		int rem = 0,rev = 0,temp = number;
		while(number > 0) {
			rem = number % 10;
			rev = (rev*10) + rem;
			number = number / 10;
		}
		if(temp == rev) {
			result = true;
		}
		return result;
	}

	static boolean isOdd(int number)
	{
		boolean result = false;
		if(number % 2 != 0 )
		{
			result = true;
		}
		return result;
	}
	
	
	
	static String palindrome(int startvalue,int endvalue) {
		String  res ="";
		for(int i = startvalue;i<endvalue;i++) {
			if(checkpalindorme(i) && isOdd(i))
			{
				res +=i + " ";
			}
		}
		return res;
	}
	public static void main(String args[]) {
		System.out.println(palindrome(100,300));
	}
}
