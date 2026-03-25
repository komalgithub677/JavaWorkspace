package oops.Polymorphism;

public class ATM  extends PaymentSystem{
	@Override
	public void pay() {
 	   System.out.println("Enter pin");
    }
}
