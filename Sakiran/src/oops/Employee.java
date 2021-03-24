package oops;

public class Employee {
	String name;
	int employeeId;
	double salary;
	
	Employee(){
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	Employee(String name,int employeeId,double salary){
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	enum ManagerType{
		 HR,Sales
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String args[]) {
		Employee sd = new Employee("sai",1254,24000.000);
	}

}
