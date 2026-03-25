package oops.inheritance.Types;

public class Dogs extends Animals {
             public void bark() {
            	 System.out.println("Bark");
             }
            public static void main(String[] args) {
				Dogs d =new Dogs();
				d.bark();
				d.eat();
				d.sleep();
			}
}
