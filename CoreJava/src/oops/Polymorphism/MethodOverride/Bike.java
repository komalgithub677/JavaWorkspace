package oops.Polymorphism.MethodOverride;

public class Bike {
             public void speed() {
            	 System.out.println("Speed of the bike 120 km/hr");
             }
             public static void main(String[] args) {
            	Vehicle v = new Vehicle();
            	v.speed();
            	 
				Bike b = new Bike();
				b.speed();
			}
}
