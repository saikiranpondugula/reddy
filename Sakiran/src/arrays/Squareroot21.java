package arrays;

import java.util.Scanner;

public class Squareroot21 {
	public static void getSquaer(int num)
    {
        String res = "";
        int count = 1;
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
                {
                  if(i*i == num) {
                    res += i + " is square root";
                }
                else {
                	if(count==1) {
                    res += " no square root";
                    break;
                	}
                }
                }
        }
        System.out.println(res);
    }
	public static void main(String args[]) {
		 getSquaer(25);
	}
}
