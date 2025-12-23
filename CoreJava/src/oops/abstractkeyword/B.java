package oops.abstractkeyword;

public class B extends A{
       @Override
       void m1() {
    	    System.out.println("Non abstract method of A Class");
    	    B b = new B();
    	    b.m1();
    	    b.m2();
       }
       
       public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
	}
}
