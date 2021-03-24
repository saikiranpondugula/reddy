package oops;

public class Kiran {

	int sno;
	String sname;
	Kiran(){
		System.out.println("default constructor");
	}
	Kiran(int sno,String sname){
		this();
		this.sno = sno;
		this.sname = sname;
	}
	String Kiran() {
		return "no = "+ sno + "\n" +"name = "+sname;
 	}
	public static void main(String[] args) {
	Kiran sd = new Kiran(10,"sai");
	System.out.println(sd.Kiran());
	}
}
