package accessspecifier;

public class BankAccount {
//	Create a class BankAccount:
//
//		private balance
//
//		public methods deposit() and withdraw()   
	
	private double balance;
	 
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	//Method to deposit money
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("Deposit Successful");
			System.out.println("Current Balance : " + balance);
		}
		else {
			System.out.println("Deposit amount must be greater than 0");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance = balance - amount;
			System.out.println("Withdrwa successful");
			System.out.println("Remaining Balance : " + balance);
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			System.out.println("Withdrawl amount must be greater than 0");
		}
	}
	
	//Optional method to check balance
	public double getBalance() {
		return balance;
	}
}
