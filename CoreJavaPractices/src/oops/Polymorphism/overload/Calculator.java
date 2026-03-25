package oops.Polymorphism.overload;

public class Calculator {
             void myAddition(int a ,int b) {
            	 System.out.println(a+b);
             }
             void myAddition(float a ,float b) {
            	 System.out.println(a+b);
             }
             void myAddition(double a ,double b) {
            	 System.out.println(a+b);
             }
             
             public static void main(String[] args) {
				Calculator c = new Calculator();
				c.myAddition(12, 23);
				c.myAddition(23.00f, 45.00f);
				c.myAddition(45.00, 46.00);
			}
}
