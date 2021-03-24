package stringsdemo;

public class Demo {

	public static void main(String[] args) {
		String  str = "Sai";
		System.out.println(str +"before modifynig data"+str.hashCode());
		str += "welcome";
		System.out.println(str +"after the modifying data"+str.hashCode());
		
		StringBuffer sc = new StringBuffer("hello");
		System.out.println(sc + "before modifying data"+ sc.hashCode());
		sc.append("welcome");
		System.out.println(sc + "after the modyfing data"+ sc.hashCode());
	}
}
