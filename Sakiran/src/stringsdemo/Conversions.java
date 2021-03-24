package stringsdemo;

import java.util.Arrays;

public class Conversions {

	public static void main(String[] args) {
		char ch[] = {'s','a','i'};
		String chr  = new String (ch);
		System.out.println(chr);
		char ch1[] = chr.toCharArray();
		Arrays.sort(ch1);
		String ss = new String (ch1);
		System.out.println("after dorting"+ss);
		
	}

}