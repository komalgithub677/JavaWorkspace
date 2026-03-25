package oops.Polymorphism.MethodOverride;

public class testOverride {
             public static void main(String[] args) {
				Animals a;
				a = new Dogs();
				a.sound();
				
				System.out.println("           ");
				
				Vehicles v;
				v = new Bikes();
				v.run();
				
				System.out.println("           ");
				
				Persons p;
				p = new Students();
				p.showDetails();
				
				System.out.println("         ");
				
				Banks b;
				b = new SBIs();
				b.getRateOfInterest();
				
				b = new Hdfcs();
				b.getRateOfInterest();
				
				System.out.println("      ");
				
				Parent3 p1 ;
				p1 = new Child3();
				p1.display();
			}
}
