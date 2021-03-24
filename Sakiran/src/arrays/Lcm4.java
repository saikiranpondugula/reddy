package arrays;

import java.util.Scanner;

public class Lcm4 {
	static int findLcm(int num1 , int num2 , int  num3){
        int rem = num1;
           while(true) {
               if ((rem % num1 == 0)&&(rem % num2 == 0)&& ( rem % num3 == 0)) {
                break;
           }
               rem++;
    }
           return rem;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in);
        System.out.println("enter 3 numbers");
        int num1 = scn.nextInt();
        int num2= scn.nextInt();
        int num3 = scn.nextInt();
        System.out.println("the lcm of given Integers are...");
        System.out.println(findLcm(num1,num2,num3));
        
    }
}
