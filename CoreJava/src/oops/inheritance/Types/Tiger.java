package oops.inheritance.Types;

public class Tiger extends Cat3 {
             void voice() {
            	 System.out.println("Tiger Roar");
             }
             public static void main(String[] args) {
				Tiger t = new Tiger();
				t.eat();
				t.sound();
			}
}
