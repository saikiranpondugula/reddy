package today2;

public class Dayscholar extends Student{
	double transportFee;
    Dayscholar(){
        this.transportFee=0.0;
    }
    public Dayscholar(int studentid, String name, double examfee,double transportFee) {
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
