package oops.Polymorphism.MethodOverride;

public class PhonePe extends Payment {
     public void payment() {
    	 System.out.println("Get cashback 100 ruppees");
     }
     public static void main(String[] args) {
    	 PhonePe p = new PhonePe();
    	 p.payment();
	}
}







