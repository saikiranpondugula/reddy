package arrays;

import java.util.Scanner;

public class Sumof5to10recursion1 {
	static int sumofNatural(int firstNumber)
	{
		if(firstNumber==1)
			return 1;
		
//		 for(int i = 1; i <= firstNumber; ++i)
//	        {
//	            // sum = sum + i;
//	            firstNumber += i;
//	        }
	return firstNumber+sumofNatural(firstNumber-1);
//		
	}
	public static void main(String args[]){
		Scanner cs =  new Scanner(System.in);
		int firstNumber;
		System.out.println("enter the numbers for natural numbers");
		 firstNumber = cs.nextInt();
		System.out.println(sumofNatural( firstNumber));
		
		
	}
 
}
