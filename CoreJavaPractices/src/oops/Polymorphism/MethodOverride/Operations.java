package oops.Polymorphism.MethodOverride;

public class Operations extends Calculator{
             public void add(int a ,int b) {
            	 System.out.println("Addition of the Two integers : " + (a+b));
             }
             
             public void add(double a , double b) {
            	 System.out.println("Addition of the two double values : " + (a + b));
             }
             
             public void add(int a , int b ,int c) {
            	 System.out.println("Addition of the three integers : " + (a+b+c));
             }
             
             public static void main(String[] args) {
				Operations o = new Operations();
				o.add(12, 13);
				o.add(23.12, 12.23);
				o.add(23, 24, 25);
			}
}
