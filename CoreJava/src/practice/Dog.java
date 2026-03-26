package practice;

public class Dog extends Animal{
	
            protected Dog() {
            	super();
            	System.out.println("child class construtor callled");
            }
			 public void bark() {
            	 System.out.println("Dogs bark");
             }
             
             public static void main(String[] args) {
				Dog d = new Dog();
				d.sound();
				d.bark();
			}
}
