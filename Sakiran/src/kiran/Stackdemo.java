package kiran;

import java.util.Scanner;

public class Stackdemo {
	static int top = -1;
	static int size = 5;
	static int stack[] = new int[size];
	
	static void menu() {
		String m = "men driven applicaton\n";
		m += "1.push\n";
		m += "2.pop\n";
		m += "3.display elements\n";
		m += "4.exist\n";
		m += "select any opiton";
		System.out.println(m);
	}
	static boolean isFull() {
		boolean b = false;
		if(top == size-1) {
			b = true;
		}
		return b;	
	}
	static boolean isEmpty() {
		boolean b = false;
		if(top == -1) {
			b = true;
		}
		return b;
	}
	static void push(int element) {
		if(! isFull()) {
		stack[++top]  = element;
		System.out.println("added element is stack");
	}
		else {
			System.out.println("stack is full");
		}
	}
	static void pop() {
		if(! isEmpty()) {
			System.out.println("delted the elements is =" +stack[top]);
			top--;
		}
		else {
			System.out.println("stack is empty");
		}
	}
	static void display() {
		if(! isEmpty()) {
			System.out.println("stack is elements area as follows");
			for(int i =0; i<=top; i++) {
				System.out.println(stack[i]);
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	while(true) {
		menu();
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the value");
			push(sc.nextInt());
			break;
		case 2:
	    	pop();
	    	break;
		case 3:
			display();
		    break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("invalid opition");
		}
	}
	}
}                                                                                                                                                                    
