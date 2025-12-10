package oops.inheritance.SingleLevelInheritance;

public class B extends A{
             public void showB() {
            	 System.out.println("Method of Class B");
             }
             
             public static void main(String[] args) {
				B b = new B();
				b.showA();
				b.showB();
			}
}
