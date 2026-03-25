package oops.Polymorphism.overload;

public class Demo {
             public void show(int a ,String s) {
            	 System.out.println("Value of a : " + a);
            	 System.out.println("Value of String s : " + s);
             }
             
             public static void main(String[] args) {
				Demo d = new Demo();
				d.show(12, "Komal Narawade");
			}
}
