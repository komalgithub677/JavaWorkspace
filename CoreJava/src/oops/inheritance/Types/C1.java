package oops.inheritance.Types;

public class C1 extends B1{
       public void showC1() {
    	   System.out.println("Method C1");
       }
       public static void main(String[] args) {
		C1 c = new C1();
		c.showA1();
		c.showB1();
		c.showC1();
	}
}
