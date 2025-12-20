package encapsulation;

public class BankAccount {
       private long accountNumber;
       private int balance;
       
       public long getaccountNumber() {
    	   return accountNumber;
       }
       
       public void setaccountNumber(long accountNumber) {
    	   this.accountNumber = accountNumber;
       }
       
       public int getbalance() {
    	   return balance;
       }
       
       public void setbalance(int balance) {
    	      if(balance>0) {
    	    	  this.balance = balance;
    	      }
       }
       
       public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setaccountNumber(34567888888l);
		System.out.println("Account Number : " + b.getaccountNumber());
		b.setbalance(1);
		System.out.println("Balance :" + b.getbalance());
		
	}
}
