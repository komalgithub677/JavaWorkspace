package oops.Polymorphism.MethodOverride;

public class Main {
	     void m1(Bank b , String name) {
				b = new Axis();
				b.rateOfInterest();
				System.err.println(name);
				b= new Sbi();
				b.rateOfInterest();
	     }
	
	
          public static void main(String[] args) {
        	  Bank b =new Bank();
        	  
//			Bank b;
//			b = new Axis();
//			b.rateOfInterest();
//			b= new Sbi();
//			b.rateOfInterest();
        	Main m = new Main();
        	m.m1(b, "Komal");	  
		}   
}
