package practice;

public class Dog extends Animal{
	
            public  Dog() {
            	super();
            	System.out.println(super.name);
            	System.out.println("child class construtor callled");
            }
			 public void bark() {
            	 System.out.println("Dogs bark");
             }
             
			 public void sound() {
				 System.out.println("child makes sound");
			 }
			 
			 public void show() {
				 super.sound();
				 sound();
				
			 }
             public static void main(String[] args) {
				Dog d = new Dog();
				d.sound();
				d.bark();
			}
}
