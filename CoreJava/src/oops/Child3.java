package oops;

public class Child3 extends Parent3{
                void display() {
                	System.out.println("This is the child class methods");
                }
                public static void main(String[] args) {
					Child3 c = new Child3();
					c.draw();
					c.display();
				}
}
