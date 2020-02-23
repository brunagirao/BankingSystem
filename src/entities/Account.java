package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	//USED WHEN THE CUSTOMER WANTS TO MAKE AN INITIAL DEPOSIT.
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	//USED WHEN THE CUSTOMER DOES NOT WISH TO MAKE AN INITIAL DEPOSIT.
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}	

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		
		this.balance += amount;
		
	}
	
	public void withdraw (double amount) {
		
		this.balance -= (amount + 5.0);
		
	}
	
	
	

}
