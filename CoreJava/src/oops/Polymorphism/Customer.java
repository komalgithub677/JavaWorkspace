package oops.Polymorphism;

public class Customer {
             public static void main(String[] args) {
				PaymentSystem p  = new UPI();
				p.pay();
				PaymentSystem p1  = new ATM();
				p1.pay();
				
				PaymentSystem p2  = new CreditCard();
				p2.pay();
				
			}
}
