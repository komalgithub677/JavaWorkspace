
public class TestVehicle {
//	Using Abstract Class
//
//	Create an abstract class Vehicle with abstract method start()
//	Implement it in Car and Bike.
    public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.start();
		
		Vehicle v2 = new Bike();
		v2.start();
	}
}
