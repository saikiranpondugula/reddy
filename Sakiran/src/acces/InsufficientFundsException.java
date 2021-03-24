package acces;

public class InsufficientFundsException  extends Exception {
	
	double amount;
	
	public double  getAmount() {
		return amount;
		
	}

}
