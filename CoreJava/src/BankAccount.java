
public class BankAccount {
//	Create a BankAccount class with private accountNumber and balance.
//	Provide methods deposit() and withdraw().
	
	private long accountNumber;
	private double balance;
	
	public long  getaccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			
			System.out.println("Withdraw Successful : ");
		}
		else {
			System.out.println("Insufficient balance to withdraw money from account");
		}
		
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("Deposit successfully ");
		}
	}
	
	public static void main(String[] args) {
		BankAccount  b = new BankAccount ();
		b.setAccountNumber(345678392090l);
		System.out.println("Account Number : " + (b.getaccountNumber()));
		
		b.setBalance(300.0);
		System.out.println("Balance : " + (b.getbalance()));
	
		b.withdraw(100);
		System.out.println("After withdrwaing amount :" + (b.getbalance()));
		
        b.deposit(200);	
		System.out.println("Amount after depositing money : " + (b.getbalance()));
		
		
	}
}
