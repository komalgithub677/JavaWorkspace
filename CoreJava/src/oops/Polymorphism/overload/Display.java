package oops.Polymorphism.overload;

public class Display {
             public void display(int a) {
            	 System.out.println("This is the integer value" + a);
             }
             
             public void display(String s) {
            	 System.out.println("This is a String : " + s);
             }
             
             public static void main(String[] args) {
				Display d = new Display();
				d.display(12);
				d.display("Komal Narawade");
			}
}
