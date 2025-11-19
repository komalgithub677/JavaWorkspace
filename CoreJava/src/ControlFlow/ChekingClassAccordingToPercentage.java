
package ControlFlow;

public class ChekingClassAccordingToPercentage {
             public static void main(String[] args) {
				int marks = 95;
				if(marks>=35 && marks<=100) {
					if(marks>=90) {
						System.out.println("Distinction class");
					}
					else if(marks>=70 && marks<90) {
						System.out.println("First class");
					}
					else if(marks>=50 && marks<79) {
						System.out.println("Second class");
					}
				}
				else {
					System.out.println("Student failed.. Better luck next time..");
				}
			}
}