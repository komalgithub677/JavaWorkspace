package practice;

public class BankAccount {
	private double balance ;
	private long accountNo;
	
//	           BankAccount(double balance ,long accountNo ){
//	        	   this.balance = balance;
//	        	   this.accountNo =accountNo;
//	           }
	           
	           public double getBalance() {
	        	   return balance;
	           }
	           
	           public void setBalance(double balance) {
	        	   this.balance = balance;
	           }
	
	           public long getAccountNo() {
	        	   return accountNo;
	           }
	           
	           public void setAccountNo(long accountNo) {
	        	   this.accountNo = accountNo;
	           }
	           
	           public void withdraw(double amount) {
	        	   if(balance>0 && amount<=balance) {
	        		   balance = balance - amount;
	        		   System.out.println("Withdraw Amount successfully:");
	        		   System.out.println("Remaining balance : " + balance);
	        	   }
	        	   else {
	        		   System.out.println("Insufficient balance");
	        	   }
	           }
	           
	           public void deposit(double amount) {
	        	   balance = balance + amount;
	        	   System.out.println("DepositAmount : ");
	        	   System.out.println("balance after deposited : " + balance);
	           }
	
              public static void main(String[] args) {
				BankAccount b =new BankAccount();
				
				b.setBalance(20000.00);
				System.out.println("Balance : " + b.getBalance());
				
				b.setAccountNo(23555555555l);
				System.out.println("AccountNo : " + b.getAccountNo());
				
				b.withdraw(2000);
				b.deposit(1000);
			}
}
