package today;

public class InsufficientFundsException extends Exception{
	double amount;
	public  double getAmount() {
		return amount;
	}
	
	public InsufficientFundsException() {
		this.amount = amount;
		
	}
	public InsufficientFundsException(String info) 
	{
		super(info);
	}
}
