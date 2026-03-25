package oops.Polymorphism;

public class CreditCard extends PaymentSystem {
	@Override
	public void pay() {
 	   System.out.println("Enter cvv");
    }
}
