package oops.inheritance.Types;

public class SportCar extends Cars {
             public void sportcar() {
            	 System.out.println("Sportcar");
             }
             public static void main(String[] args) {
				SportCar s = new SportCar();
				s.cars();
				s.message();
				s.sportcar();
			}
}
