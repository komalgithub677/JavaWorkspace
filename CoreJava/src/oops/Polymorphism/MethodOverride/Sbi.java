package oops.Polymorphism.MethodOverride;

public class Sbi {
             public void getInterest() {
            	         System.out.println("Sbi gives the interest as 10%");
             }
             public static void main(String[] args) {
				Sbi s = new Sbi();
				s.getInterest();
				
				Bank b = new Bank();
				b.getInterest();
			}
}
