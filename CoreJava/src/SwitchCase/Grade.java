package SwitchCase;

public class Grade {
        public static void main(String[] args) {
        	//4. Take a grade character (A, B, C, D, F) as input and print a message:

        		//A → Excellent
        		//B → Good
        		//C → Average
        		//D → Poor
        		//F → Fail
        	
        	char c = 'A';
        	
        	switch(c) {
        	case 'A':
        		System.out.println("Excellent");
        	break;
        	case 'B':
        		System.out.println("Good");
        	break;
        	case 'C':
        		System.out.println("Average");
        	break;
        	case 'D':
        		System.out.println("Poor");
        	break;
        	case 'F':
        		System.out.println("Fail");
        	break;
        	
        	default:
        		System.out.println("Enter grade is not valid");
        		
        	}
		}
}
