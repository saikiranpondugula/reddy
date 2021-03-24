package sai;

public class Saiirna {
static void dispNames(String names[]) {
	System.out.println("names:");
	for(String x :names ) {
		System.out.println(x);
	}
}
public static void main(String args[]) {
	//String names[] = {"ramu","sai","krishna"};
	//dispNames(names);
	dispNames(args);
}
}
