package today2;

public class Hosteller extends Student{
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