package oops.inheritance.Types;

public class Square extends Shape {
             public void square() {
            	 System.out.println("This is the square shape");
             }
             public static void main(String[] args) {
				Square s = new Square();
				s.shapes();
				s.square();
			}
}
