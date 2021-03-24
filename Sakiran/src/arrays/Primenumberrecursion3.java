package arrays;

import java.util.Scanner;

public class Primenumberrecursion3 {
		static boolean getPrime(int num, int value) {    
			if (num <= 2 && num % value == 0 && value * value > num) 
//				//return (num == 2) ? true : false;
//			//if (num % value == 0) 
//				return false; 
//			if (value * value > num)
//				return true;  
			return getPrime(num, value + 1);
			return true;
			} 
		public static void main(String[] args) {   
			String res = "";  
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the primenumber : ");
			if(getPrime(scanner.nextInt(), 2)) {
				res += " is a Prime number";
				}
			else { 
				res += "is Not a prime number";   
				}
			System.out.println(res); 
	}
	}
