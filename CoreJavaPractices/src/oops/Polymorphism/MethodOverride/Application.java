package oops.Polymorphism.MethodOverride;

public class Application {
             public void reward() {
            	 System.out.println("You have a cashback on the merchant Payment ");
             }
             
             public static void main(String[] args) {
				Payments p;
				
				System.err.println("Phonpe Details : ");
				p = new Phonepe();
				p.checkBalance();
				p.reward();
				
				System.out.println("                ");
				
				System.err.println("Gpay Details : ");
				p = new Gpay();
				p.reward();
				p.checkBalance();
				
				System.out.println("          ");
				
				System.err.println("Paytm Details : ");
				p = new Paytm();
				p.checkBalance();
				p.reward();
				
				System.out.println("           ");
				
				System.err.println("Razarpay Details : ");
				p = new Razarpay();
				p.checkBalance();
				p.reward();
				
				System.out.println("            ");
			}
}
