package oops.inheritance.Types;

public class Child1 extends Parents{
             public void showc1() {
            	 System.out.println("This is the child1 class method");
             }
             public static void main(String[] args) {
				Child1 c1 = new Child1();
				c1.show();
				c1.show();
				c1.showc1();
			}
}
