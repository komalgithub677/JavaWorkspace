package oops.abstraction;

public class MyCalculator {
             public void add(int a ,int b) {
            	 System.out.println("Addition = " + (a+b));
             }
             
             public void multiply(int a ,int b) {
            	 System.out.println("Multiplication = " + (a*b));
             }
             
             public static void main(String[] args) {
				MyCalculator m = new MyCalculator();
				m.add(12, 13);
				m.multiply(10, 23);
			}
}
