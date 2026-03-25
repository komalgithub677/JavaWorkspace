package oops.Polymorphism.MethodOverride;

public class Cat extends Animal {
             public void sound() {
            	 System.out.println("This is the cat sound");
             }
             public static void main(String[] args) {
            	 Animal a = new Animal();
            	 a.sound();
            	 
				 Cat c = new Cat();
				 c.sound();
			}
}
