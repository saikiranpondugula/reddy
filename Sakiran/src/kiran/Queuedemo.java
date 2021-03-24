package kiran;

import java.util.Scanner;

public class Queuedemo {
    static int front = 0;
	static int rear = 0;
	static int size = 5;
	static int queue[] = new int[size];
	
	static void menu() {
		String m = "menu driven applicaton\n";
		m += "1.Insert\n";
		m += "2.Delete\n";
		m += "3.display elements\n";
		m += "4.exist\n";
		m += "select any opiton\n";
		System.out.println(m);
	}
	static boolean isFull() {
		boolean b = false;
		if(rear == size) {
			b = true;
		}
		return b;	
	}
	static boolean isEmpty() {
		boolean b = false;
		if(front == rear) {
			b = true;
		}
		return b;
	}
	static void insert(int element) {
		if(! isFull()) {
		queue[rear++]  = element;
		System.out.println("added element to queue\n");
	}
		else {
			System.out.println("!Queue is full");
		}
	}
	static void delete() {
		if(! isEmpty()) {
			System.out.println("delted the elements is =" +queue[front]);
			for(int i = 0; i<rear-1; i++) {
				queue[i]   = queue[i+1];
			}
			rear++;
		}
		else {
			System.out.println("queue is empty");
		}
	}
	static void display() {
		if(! isEmpty()) {
			System.out.println("queue  is elements area as follows");
			for(int i = front; i<= rear; i++) {
				System.out.println(queue[i]);
			}
		}
		else {
			System.out.println("no elements in queue");
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
			insert(sc.nextInt());
			break;
		case 2:
	    	delete();
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
