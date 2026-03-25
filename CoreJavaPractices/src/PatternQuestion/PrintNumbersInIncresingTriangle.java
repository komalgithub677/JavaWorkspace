package PatternQuestion;

public class PrintNumbersInIncresingTriangle {
             public static void main(String[] args) {
				//⭐ 4. Print numbers in increasing triangle
            	 /*
            	  1
                  12
                  123
                  1234
                  12345

            	  */
            	 for(int i=1; i<=5; i++ ) {
            		 
            		 for(int j=1; j<=i; j++) {
            			 System.out.print(j);
            			
            		 }
            		 System.out.println();
            	 }
			}
}
