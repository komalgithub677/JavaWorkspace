package PatternQuestion;

public class PrintAlphabetTriangle {
             public static void main(String[] args) {
            	 //⭐ 8. Print alphabet triangle
            	/* A
            	 AB
            	 ABC
            	 ABCD
            	 ABCDE
            	 */
            	
            	 for(int i=1; i<=5; i++ ) {
            		 char ch ='A';
            		 for(int j=1; j<=i; j++) {
            			 System.out.print(ch);
            			 ch++;
            		 }
            		 System.out.println();
            	 }

			}
}
