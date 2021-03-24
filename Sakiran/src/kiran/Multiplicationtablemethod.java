package kiran;

public class Multiplicationtablemethod {
	static String  disp(int number) {
		String res ="";
		for(int i = 1;i <= 10; i++) {
			res += number + "*" + i + "=" + (number*i);
			res += "\n";
		}
		return res;
	}
	static String rangeoftables(int startnumber,int endnumber) {
			String rest = "";
			for(int i = startnumber ;i <= endnumber; i++) {
				rest += disp(i);
				rest += "\n";
			}
			return rest;
		}
		public static void main(String args[]) {
	System.out.println(rangeoftables(1,12));		
		}
}
