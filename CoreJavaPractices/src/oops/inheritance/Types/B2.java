package oops.inheritance.Types;

public class B2 extends A2{
             public void m2() {
            	 System.out.println("Method m2 called");
             }
             public static void main(String[] args) {
				B2 b = new B2();
				b.m1();
				b.m2();
			}
}
