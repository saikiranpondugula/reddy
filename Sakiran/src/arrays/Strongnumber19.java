package arrays;

import java.util.Scanner;

public class Strongnumber19 {
static boolean strongnum( int num) {
    int temp = num,sum = 0,rem,res;
    boolean b = false;
    while (num  !=0) {
        rem = num % 10;
        int fact = 1;
        while (rem >= 1) {
            
            fact = fact* rem;
            rem--;
        }
        sum += fact;
        num = num/10;
        }
    if (temp == sum) {
        b = true;
}
    return b;   
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter Strong number");
    int num =sc.nextInt();
    System.out.println(strongnum(num));
}
}
