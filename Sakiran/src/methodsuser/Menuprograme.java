package methodsuser;

import java.util.Scanner;

public class Menuprograme {
	static void menu() {
		String  sai = "menu drivenappliocaiton\n";
		sai +="1 addition\n";
		sai +="2 subtraction\n";
		sai +="3 multiplicaiton\n";
		sai +="3 division\n";
		sai +="4 exist\n";
		System.out.println(sai);
	}
	static int calAddition(int firstNumber,int  secondNumber) {
		return firstNumber + secondNumber;
	}
	static int calSubtraction(int firstNumber,int  secondNumber) {
		return firstNumber - secondNumber;
	}
	static int calMultiplication(int firstNumber,int  secondNumber) {
		return firstNumber * secondNumber;
	}
	static int calDivision(int firstNumber,int  secondNumber) {
		return firstNumber / secondNumber;
	}
	static void accept() {
		System.out.println("enter the two numbers");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
		menu();
		int choice = sc.nextInt();
		String res = "";
		switch(choice) {
		case 1:
			accept();
			res = "sum = "+ calAddition(sc.nextInt(),sc.nextInt());
			break;
		case 2:
			accept();
			res = "sub = "+ calSubtraction(sc.nextInt(),sc.nextInt());
			break;
			case 3:
				accept();
				res = "mul = "+ calMultiplication(sc.nextInt(),sc.nextInt());
				break;
			case 4:
				accept();
				res = "div = "+ calDivision(sc.nextInt(),sc.nextInt());
				break;
				default:
					accept();
					res = "invalid operation";
					break;
		}
		System.out.println(res);
		}
	}
}

