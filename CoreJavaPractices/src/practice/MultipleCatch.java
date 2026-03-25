package practice;

public class MultipleCatch {
             public static void main(String[] args) {
            	String s =null;
				try {
					System.out.println(s.length()-1);
					System.out.println(2/0);
				}
				catch(ArithmeticException e) {
					System.out.println("Arithmetic Exception");
				}
				catch(NullPointerException n) {
					System.out.println("Null pointer Exception");
				}
			}
}
