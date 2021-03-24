package searching;

import java.util.Scanner;

public class Naturalnumbersrecursion {
	 static int addNumbers(int num) {
	        if (num != 0)
	            return num + addNumbers(num - 1);
	        else
	            return num;
	    }
	 public static void main(String[] args) {
	        int number = 5;
	        int sum = addNumbers(number);
	        System.out.println("Sum = " + sum);
	 }
}