package oops.contructor;

public class BankAccountInfo {
             
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		int totalDesposit = b.deposit(1000);
		System.out.println(totalDesposit);
		
		
		int totalWithdraw = b.withdraw(500);
		System.out.println("Total withdraw amount would be :" + totalWithdraw);
        
		b.setBalance(500);
        System.out.println("Get balance method would be :" + b.getBalance());
        
		
		
		
	}
}
