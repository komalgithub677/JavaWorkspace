package oops.inheritance.Types;

public class C2 extends A2{
             public void m3() {
            	 System.out.println("Method m3 called");
             }
             public static void main(String[] args) {
				C2 c = new C2();
				c.m1();
				c.m3();
			}
}
