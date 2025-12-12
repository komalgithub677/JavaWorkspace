package oops.inheritance.Types;

public class Child2 extends Parents {
       public void showc2() {
    	   System.out.println("Methods of class Child2 Method");
       }
       public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.showc2();
		c2.show();
	}
}
