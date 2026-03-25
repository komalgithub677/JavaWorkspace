package breakandcontinue;

public class StopAtProductGreaterThan100 {
             public static void main(String[] args) {
				// Print the table of 12 but stop printing when the product becomes greater than 100. (Use break)
            	 for(int i=1; i<=10; i++) {
            		 int product = i*12;
            		 if(product>100) {
            			 break;
            		 }
            		 System.out.println(product);
            	 }
			}
}
