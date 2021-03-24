package methodsuser;

import java.util.Scanner;

public class Saikiranreddy {
	//method with return type & pararmeterised one
	static boolean even(int number) {
		boolean sai = false;
		if(number % 2 == 0){
			sai  = true;
		}
		return sai;
	}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value");
	/*if(even(sc.nextInt())){
		System.out.println("even number");
	}
	else {
		System.out.println("odd number");
	}
	}*/
	}
}
