package scanner;

import java.util.Scanner;

public class PassOrFail {
             public void passOrFail(float marks) {
            	 if(marks<35) {
            		 System.out.println("Student failed ");
            	 }
            	 else {
            		 System.out.println("Student Pass");
            	 }
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				float marks = sc.nextFloat();
				
				PassOrFail pf = new PassOrFail();
				pf.passOrFail(marks);
				
			}
}
