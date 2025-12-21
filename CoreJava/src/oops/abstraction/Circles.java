package oops.abstraction;

public class Circles implements Shapes{
             public void draw() {
            	 System.out.println("Draw the circle...");
             }
             
             public static void main(String[] args) {
				Circles c = new Circles();
				c.draw();
				
			}
}
