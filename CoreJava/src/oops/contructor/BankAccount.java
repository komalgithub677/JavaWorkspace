package oops.contructor;

public class BankAccount {
//	2. Create a class BankAccount using encapsulation with private balance.
//	Add methods: deposit(), withdraw(), getBalance().
//	Perform operations in main.**
	
	private int balance;
	public int deposite;
	public int withdraw;
	
	public int deposit(int amount) {
		   if(amount>0) {
			   balance +=amount;
			   System.out.println(amount + "deposited");
		   }
		   else {
			   System.out.println("Invalid deposit amount:");
		   }
		   return amount;
	}
	
	public int withdraw(int amount) {
		if(amount>0 && amount<=balance) {
			balance -=amount;
			System.out.println(amount + "withdrawn");
		}
		else {
			System.out.println("Insufficient amount or invalid amount");
		}
		return amount;
	}
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
