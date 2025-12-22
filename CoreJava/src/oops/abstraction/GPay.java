package oops.abstraction;

public class GPay implements Payment{
	public void pay(double amount) {
		// TODO Auto-generated method stub
		double total = amount + transactionfees;
		System.out.println(total);
		
		
	}
}
