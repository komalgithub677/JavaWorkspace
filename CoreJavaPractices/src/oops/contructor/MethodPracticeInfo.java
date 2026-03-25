package oops.contructor;

public class MethodPracticeInfo {
             public static void main(String[] args) {
				MethodPractice m = new MethodPractice();
				m.printMessage();
				m.add(20, 12);
				System.out.println("Result would be :" + (m.multiply(12, 13)));
				System.out.println("Name : " + m.getName());
				
				m.isEven(12);
			}
}
