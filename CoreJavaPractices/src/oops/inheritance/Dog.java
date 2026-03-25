package oops.inheritance;

public class Dog extends Animal { //Sub Child
                public void dColor() {
                	System.out.println("White ....");
                }
                
               


public static void main(String[] args) {
	Dog d = new Dog();
	d.dColor();
	d.eating();
}
}


