package practice;

 public class BankAccounts {
//	Create BankAccount class with deposit & withdraw methods
	private int id;
	private String name;
	private String ifsccode;
	private double balance;
	
//	public BankAccounts() {
//		this.id = id;
//		this.name =name;
//		this.ifsccode =ifsccode;
//	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id =id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String  getifsccode() {
		return ifsccode;
	}
	
	public void setId(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance =balance;
	}
	
	public void withdraw(int amount) {
		if(amount<=0) {
			System.out.println("Invalid amount");
		}
		else if(amount >balance) {
			System.out.println("balance is not sufficient to withdraw money");
		}
		else {
			balance -= amount;
			System.out.println("withdraw amount : " + balance);
		}
	}
	
	public void deposit(int amount) {
		if(balance >0) {
			balance +=amount;
			System.out.println("deposited amount : " + balance);
		}
		else {
			System.out.println("Invalid amount ");
		}
	}
	
	public static void main(String[] args) {
		BankAccounts b = new BankAccounts();
		b.setId(101);
		System.out.println("id : " + (b.getId()));
		b.setName("Komal");
		System.out.println("name : " + (b.getName()));
		b.setId("SBIN0023456");
		System.out.println("ifsccode : " + (b.getifsccode()));
		b.setName("SBI");
		System.out.println("name : " + (b.getName()));
		
		b.setBalance(200);
		System.out.println("balance : " + (b.getBalance()));
		
		b.deposit(100);
		System.out.println("balance after depositing : " +(b.getBalance()));
		
		b.withdraw(100);
		System.out.println("balance after withdrawing : " + (b.getBalance()));
		
	}
	
	
}
