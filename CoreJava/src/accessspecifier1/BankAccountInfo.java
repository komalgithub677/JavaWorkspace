package accessspecifier1;

import accessspecifier.BankAccount;

public class BankAccountInfo {
             public static void main(String[] args) {
//				double initialBalance;
				BankAccount b = new BankAccount(1000);
				b.deposit(5000);
				b.withdraw(2000);
				b.withdraw(30000);
				
				System.out.println("Final balance : " + b.getBalance());
			}
}
