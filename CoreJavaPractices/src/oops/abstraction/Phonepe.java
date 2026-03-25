package oops.abstraction;

public class Phonepe implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		double total = amount + transactionfees;
		System.out.println(total);
		
		
	}

	

}
