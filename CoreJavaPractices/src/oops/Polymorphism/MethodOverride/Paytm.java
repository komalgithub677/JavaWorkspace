package oops.Polymorphism.MethodOverride;

public class Paytm extends Payments {
             public void reward() {
            	 System.out.println("Paytm : Get cashback of 5 rupppes on the merchant payment");
             }
             public void checkBalance() {
            	 System.out.println("Paytm : Check your account balance");
             }
}
