package oops.inheritance.Types;

public class classC extends B{
             public void showC() {
            	 System.out.println("C methods");
             }
             public static void main(String[] args) {
				classC c = new classC();
				c.showA();
				c.showB();
				c.showC();
			}
}
