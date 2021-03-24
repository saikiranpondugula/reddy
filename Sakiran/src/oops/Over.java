package oops;

public class Over {

	Over(){
		System.out.println("default constructor");
	}
	Over(int sno){
		this();
		System.out.println("one paramterised constructor");
	}
	Over(int sno,String sname){
		this(sno);
		System.out.println("two paramtersied constuctor");
	}
	Over(int sno,String sname,int marks){
		this(sno,sname);
		System.out.println("three paramterised constructor");
	}
	public static void main(String[] args) {

		Over  s = new Over(11,"dai",100);

	}
}
