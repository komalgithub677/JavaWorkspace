package exceptionhandling;

public class Day1 {
             public static void main(String[] args) {
				System.out.println(4/2);
				System.out.println(2/2);
				System.out.println(6/2);
				try {
					System.out.println(4/0);
				}catch(ArithmeticException e) {
					System.out.println("Divide by zero not allowed....");
				}
				finally {
					System.out.println("I am finally always excuted");
				}
				System.out.println(12/2);
				System.out.println(6/2);
				System.out.println(8/2);
			}
}



