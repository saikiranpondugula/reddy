package today;

public class CheckingAccount {
	
	int accountNo;
	double balance;
	
	 boolean checkAccount(int accountNo) {
	        if(accountNo > 0) {
	        return true;
	    }
	        return false;
	    }
	  void despoit(double amount) {
	        balance  += amount;
	    }
	   boolean withdraw(double amount){
	        try {
	        if(balance < amount) {
	        throw new InsufficientFundsException("insuffient balance");
	        }
	        else {
	            System.out.println("amount withdraw sucessfully");
	            balance -= amount;
	            System.out.println(balance);
	        }
	        }
	        catch(Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return false;  
	    }
}
