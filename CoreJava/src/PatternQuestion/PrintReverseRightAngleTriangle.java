package PatternQuestion;

public class PrintReverseRightAngleTriangle {
             public static void main(String[] args) {
				//⭐ 3. Print a reverse right triangle
            	 /*
                  *****
                  ****
                  ***
                  **
                  *

            	  */
            	 for(int i=4; i>=1; i--) {
            		 for(int j=1; j<=i; j++) {
            			 System.out.print("*");
            		 }
            		 System.out.println();
            	 }
            	 
			}
}
