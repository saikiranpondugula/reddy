package acces;

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
class DayScholar extends Student{
    double transportFee;
    DayScholar(){
        this.transportFee=0.0;
    }
    public DayScholar(int studentid, String name, double examfee,double transportFee) {
        super();
        this.studentid = studentid;
        this.name = name;
        this.examfee = examfee;
        this.transportFee=transportFee;
    }
    public String displayDetails() {
        return "DayScholar [studentid=" + studentid + ", name=" + name + ", examfee=" + examfee + ",transportFee=" +transportFee+"]";
        
        
        
    }
    double payFee(int amount)
    {
        if (examfee+transportFee==amount) {
            System.out.println("no due  balance");
        }
            
        return amount-examfee-transportFee;
    
        
        
    }
    
    
    
}
class Hosteller extends Student{
    double hostelFee;
    
    Hosteller(){
        this.hostelFee=0.0;
    }
    
    public Hosteller(int studentid, String name, double examfee,double hostelFee) {
        super();
        this.studentid = studentid;
        this.name = name;
        this.examfee = examfee;
        this.hostelFee=hostelFee;
    }
    
    public String displayDetails() {
        super.displayDetails();
        return "Hosteller [studentid=" + studentid + ", name=" + name + ", examfee=" + examfee + ",hostelFee="+hostelFee+"]";
        
        
    }
    double payFee(int amount)
    {
        
    
        if (examfee+hostelFee==amount) {
            System.out.println("no due  balance");
            
        }
        return amount-examfee-hostelFee;
        
    }
}
