package SwitchCase;

public class StudentStream {
       public static void main(String[] args) {
		String studentStream = "Science";
		
		switch(studentStream) {
		case "Science":
			System.out.println("Student stream would be the science");
		break;
		case "Art":
			System.out.println("Student Stream would be the art");
		break;
		case "Commerce":
			System.out.println("Student stream would be the Commerce");
		break;
		default:
			System.out.println("Enter stream is not valid");
		}
	}
}