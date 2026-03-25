package breakandcontinue;

public class SkipFirstOddNumber {
             public static void main(String[] args) {
            	// Print even numbers from 1 to 100 but stop when you get first odd number.
            	 for(int i=1; i<=100; i++) {
            		 if(i%2==1) {
            			break;
            		 }
            		 System.out.println(i);
            	 }
			}
}
