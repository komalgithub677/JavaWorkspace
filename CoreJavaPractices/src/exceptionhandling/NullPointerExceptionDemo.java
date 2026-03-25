package exceptionhandling;

public class NullPointerExceptionDemo {
              public static void main(String[] args) {
				String s =null;
				
				try {
					System.out.println("String length :" + s.length());
				}
				catch(NullPointerException n) {
					System.out.println("Accessing the null values");
				}
			}
}
