package sai;


import java.util.Arrays;

public class Charcterarray {
	static String dispNames(char  name[]) {
		Arrays.sort(name);
		System.out.println("names :");
		for(char x : name ) {
			System.out.println(x);
		}
		
		String str = new String(name);
		return str;
		}
public static void main(String args[]) {
	String name = "DCB";
	dispNames(name.toCharArray());
}
}
