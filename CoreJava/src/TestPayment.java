
public class TestPayment {
//	Using Interface
//
//	Create an interface Payment with method pay()
//	Implement it using UPI and CreditCard.
	public static void main(String[] args) {
		Payment p =new UPI();
		Payment p1 = new creditCard();
		
		p.pay();
		p1.pay();
	}
    
}
