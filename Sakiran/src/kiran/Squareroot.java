package kiran;

import java.util.Scanner;

public class Squareroot {
public static void main(String[] args) {
    getSquare(9);
}
public static void getSquare(int num)
{
    String res = "";
    for(int i=2;i<num;i++)
    {
        if(num % i == 0)
        {
            if(i*i == num)
            {
                res += i + "is square root";
            }
            else
            {
                res += " no square root";
            }
        }
    }
    System.out.println(res);
   
}
}
