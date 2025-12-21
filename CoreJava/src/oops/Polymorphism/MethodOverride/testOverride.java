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
			}
}
