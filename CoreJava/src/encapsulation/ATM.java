package encapsulation;

public class ATM {
//	Create a class ATM with private variables pin and balance.
//	Provide public methods deposit() and withdraw() to access the balance securely.
	private int pin;
	private double balance;
	
	public int getpin() {
		return pin;
	}
	public void setpin(int pin) {
		this.pin = pin;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(int balance) {
		balance +=balance;
		System.out.println("deposit balance " + balance);
	}
	
	public void withdraw() {
		balance -=balance;
		System.out.println("withdraw balance :  " + balance);
	}
	
	public static void main(String[] args) {
		ATM a = new ATM();
		a.setbalance(300000.00);
		System.out.println("Clear Balance " + (a.getbalance()));
		
		a.deposit(2000);
		a.withdraw();
	}
}
