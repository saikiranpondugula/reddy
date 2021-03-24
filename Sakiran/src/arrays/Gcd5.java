package arrays;

import java.util.Scanner;

public class Gcd5 {
	static int findGcd(int num1 , int num2 , int  num3){
        int rem = num1;
           while(true) {
               if ((num1 % rem == 0)&&(num2 % rem == 0)&& ( num3 % rem == 0)) {
                break;
           }
               rem--;
    }
           return rem;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in);
        System.out.println("enter 3 numbers");
        int num1 = scn.nextInt();
        int num2= scn.nextInt();
        int num3 = scn.nextInt();
        System.out.println("the gcd of given range is...");
        System.out.println(findGcd(num1,num2,num3));   
    }
}
