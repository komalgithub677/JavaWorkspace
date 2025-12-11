package oops.inheritance.Types;

public class Car extends Vehicle {
              public void drive() {
            	  System.out.println("Drive the vehicle");
              }
              public static void main(String[] args) {
				Car c = new Car();
				c.start();
				c.drive();
			}
}
