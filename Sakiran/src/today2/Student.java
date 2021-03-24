package today2;

public class Student {
	int studentid;
    String name;
    double examfee;
    
    Student(){
        this.studentid = 0;
        this.name = null;
        this.examfee = 0.0;
        
    }
    public Student(int studentid, String name, double examfee) {
        super();
        this.studentid = studentid;
        this.name = name;
        this.examfee = examfee;
    }

     String displayDetails()
    {
        return "Student [studentid=" + studentid + ", name=" + name + ", examfee=" + examfee + "]";
        
    }
    double payFee(int amount)
    {
        return amount-examfee;   
    }
}
