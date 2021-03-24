package acces;

public class Account {
	  int accountnumber;
	  int balance;
	  
	public Account(int accountnumber,int balance) {
		this.accountnumber = accountnumber;
		this.balance = balance;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
