package today1;

public  abstract class Student {
	String studentName;
	String studentClass;
	protected static int totalNoofStudents;

	
	public abstract  void getPercentage(); 
	public static   void getTotalNoStudents() {
	}
	
	
	public Student() {
	}
	
	public Student(String studentName,String studentClass) {
		this.studentClass = studentClass;
		this.studentName = studentName;
	}

}
