package oops.Polymorphism.overload;

public class Calculator1 {
             public void add(int a , int b) {
            	 System.out.println("Addition of Two integers : " + (a+b));
             }
             public void add(int a , int b ,int c) {
            	 System.out.println("Addition of three integers : " + (a+b+c));
             }
             
             public static void main(String[] args) {
				Calculator1 c1 = new Calculator1();
				c1.add(12, 13);
				c1.add(12, 13, 14);
			}
}
