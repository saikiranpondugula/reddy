package kiran;

import java.util.Scanner;

public class Strongnumber {

	static boolean strongnum( int number) {
        int temp= number,sum=0,rem,res;
        boolean result= false;
        while (number  != 0) {
            rem = number % 10;
            int fact = 1;
            while (rem >= 1) {
                
                fact = fact * rem;
                rem--;
            }
            sum += fact;
            number =  number/10;           
            }
        if (temp == sum) {
            result = true;
    }
        return result;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the strong number");
        int number1 = sc.nextInt();
        System.out.println(strongnum(number1));
    }
    }