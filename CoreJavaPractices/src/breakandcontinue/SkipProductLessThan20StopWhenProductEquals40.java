package breakandcontinue;

public class SkipProductLessThan20StopWhenProductEquals40 {
             public static void main(String[] args) {
				//Print table of 5, skip products less than 20, stop when product becomes 40.
            	 for(int i=1; i<=10; i++) {
            		 int product =i*5;
            		 if(product<20) {
            			 continue;
            		 }
            		 if(product==40) {
            			 break;
            		 }
            		 System.out.println(product);
            	 }
			}
}
