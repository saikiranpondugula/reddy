package sai;

import java.util.Scanner;

public class Primenumberrecursion {
	public static  int primes(int x, int i)
	{
	    if(i==1)
	        return 1;
	    if(x%i==0)
	        return 0;
	    else
	    return    primes(x, i-1);
	}
	 public static void main(String[] args) {
		 System.out.println(primes(4,2));
	 }
	 }

	        
