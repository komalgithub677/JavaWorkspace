package oops.statickeyword;

public class Outer{
            
	
	void m1() {
		System.out.println("This is outer class mehtod m1");
	}
	public static class Inner{
		void m2() {
			System.out.println("This is inner class m2 method");
		}
	}
	
	public static void main(String[] args) {
//		Outer o = new Outer();
//		o.m1();
		
		Outer.Inner i = new Inner();
		i.m2();	
	}
}
