package oops.Polymorphism.overload;

public class Multiplication {
//	2.Overload a method multiply() to multiply:
//		two int values
//		two double values
             public void multiply(int a , int b) {
            	 System.out.println("Multiplication of two numbers : " + (a*b));
             }
             public void multiply(double a , double b) {
            	 System.out.println("Multiplication of two double values : " + (a*b));
             }
             public static void main(String[] args) {
				Multiplication m = new Multiplication();
				m.multiply(12, 13);
				m.multiply(12.30, 14.30);
			}
}
