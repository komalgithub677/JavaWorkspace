package oops.inheritance.Types;

public class DoublesTheValues extends VariableA {
             public void doubleValues() {
            	 a = a * 2;
            	 System.out.println(a);
             }
             public static void main(String[] args) {
            	 DoublesTheValues d = new  DoublesTheValues();
            	 d.doubleValues();
			}
}
