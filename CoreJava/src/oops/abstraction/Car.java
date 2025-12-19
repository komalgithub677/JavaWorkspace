package oops.abstraction;

public class Car implements Vehicle {
             public void start() {
            	 System.out.println("Your car is ready to Start....");
             }
             
             public static void main(String[] args) {
				Car c = new Car();
				c.start();
			}
}
