package oops.Polymorphism.MethodOverride;

public class Child2 extends Parent2 {
             public void login() {
            	 System.out.println("This is the login method of the Child Class");
             }
             public static void main(String[] args) {
				Child2 c = new Child2();
				c.login();
				
				Parent2 p = new Parent2();
				p.login();
			}
}
