package stringsdemo;

public class Stringdemoe {
	public static void main(String args[]) {
		String atr = "asdfghj";
		System.out.println(atr.length());
		System.out.println(atr.toUpperCase());
		System.out.println(atr.indexOf("d"));
		System.out.println(atr.indexOf("asd"));
		System.out.println(atr.indexOf("z"));
		String values  = "1,4-3,12-9";
		values = values.replace("-", ",");
		System.out.println(values);
		String v[] = values.split(",");
		for(String x: v) {
			System.out.println(x);
		}
	}

}
