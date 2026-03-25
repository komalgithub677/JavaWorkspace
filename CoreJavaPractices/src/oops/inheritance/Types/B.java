package oops.inheritance.Types;

public class B extends A {
//	1.Create class A with method showA() and class B extending A with method showB().
//	Call both methods using object of B.
	public void showB() {
		System.out.println("This is a B method");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.showA();
		b.showB();
	}
}
