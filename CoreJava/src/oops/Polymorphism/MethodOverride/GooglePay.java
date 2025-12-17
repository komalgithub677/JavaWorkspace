package oops.Polymorphism.MethodOverride;

public class GooglePay extends Payment {
             public void payment() {
            	 System.out.println("Get cashback of 10 rupees");
             }
             
             public static void main(String[] args) {
				GooglePay g = new GooglePay();
				g.payment();
			}
}
