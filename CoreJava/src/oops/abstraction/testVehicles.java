package oops.abstraction;

public class testVehicles {
             public static void main(String[] args) {
				Vehicles v;
				v = new Bikes();
				v.start();
				
				v = new Cars();
				v.start();
			}
}
