package oops.abstraction;

public class CalculatorsInfo implements Calculators {
             public void add(int a ,int b) {
            	 System.out.println("Addition of two numbers : " + (a+b));
             }
             
             public void multiply(int a ,int b) {
            	 System.out.println("Multiplication of two numbers : " + (a*b));
             }
             
             public static void main(String[] args) {
				CalculatorsInfo c = new CalculatorsInfo();
				c.add(12, 13);
				c.multiply(11, 12);
			}
}


