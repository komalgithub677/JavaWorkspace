package SwitchCase;

public class GradeChecker {
             public static void main(String[] args) {
				int marks = 100;
				
				switch(marks/10) {
				case 10:
					System.out.println("Excellent Grade");
				break;
				case 9:
					System.out.println("Good grade");
				break;
				case 8:
					System.out.println("Average grade");
				break;
				case 7:
					System.out.println("Low Grade");
				break;
				default:
					System.out.println("Grade not satisfied");
				}
			}
}
