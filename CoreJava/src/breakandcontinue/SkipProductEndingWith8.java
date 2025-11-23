package breakandcontinue;

public class SkipProductEndingWith8 {
             public static void main(String[] args) {
				//Print table of 6 but skip products ending with digit 8.
            	 for(int i=1; i<=10; i++) {
            		 int product = i*6;
            		 int digit = product%10;
            		 if(digit==8) {
            			 continue;
            		 }
            		 System.out.println(product);
            	 }
			}
}
