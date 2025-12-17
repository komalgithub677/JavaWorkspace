package oops.Polymorphism.MethodOverride;

public class Child1 extends Parent1{
             public void msg() {
            	 System.out.println("This is the child class method");
             }
             public static void main(String[] args) {
            	 Parent1 p = new Parent1();
            	 p.msg();
            	 
				Child1 c = new Child1();
				c.msg();
			}
}
