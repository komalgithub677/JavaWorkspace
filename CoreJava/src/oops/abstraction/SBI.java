package oops.abstraction;

public class SBI implements Banks {
     public void getRateOfInterest() {
    	 System.out.println("Rate of interest on the Sbi's : 10%");
     }
     
     public static void main(String[] args) {
		SBI s = new SBI();
		s.getRateOfInterest();
	}
}
