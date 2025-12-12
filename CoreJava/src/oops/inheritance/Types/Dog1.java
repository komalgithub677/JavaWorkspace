package oops.inheritance.Types;

public class Dog1 extends Animal1{
             public void dog1() {
            	 System.out.println("Dog Bark");
             }
             public static void main(String[] args) {
				Dog1 d1 = new Dog1();
				d1.animal();
				d1.dog1();
			}
}
