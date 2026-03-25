package oops;

public class Account {
//	Banking System
//	Account → base class (accountNumber, balance)
//
//	SavingsAccount → inherits from Account (interestRate)
//
//	PremiumSavingsAccount → inherits from SavingsAccount (additional benefits, higher limits)
	long accountNumber;
	private int balance;
	int amount;
	
	public Account(int accountNumber, int balance ) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}	
	
	
	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public void withdraw(int balance , int amount) {
		if(balance>0) {
			System.out.println("You can withdraw money from your account : ");
			int withdrawAmount = balance -amount;
			System.out.println("Withdraw amount would be : " + withdrawAmount);
		}
	}
}
