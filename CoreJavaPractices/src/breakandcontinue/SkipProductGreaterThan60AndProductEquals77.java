package breakandcontinue;

public class SkipProductGreaterThan60AndProductEquals77 {
             public static void main(String[] args) {
				//Print table of 11, skip products greater than 60, stop when product becomes 77.
            	 for(int i=1; i<=10; i++) {
            		 int product = i*11;
            		 if(product>60) {
            			 continue;
            		 }
            		 if(product==77) {
            			 break;
            		 }
            		 System.out.println(product);
            	 }
			}
}
