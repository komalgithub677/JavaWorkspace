package breakandcontinue;

public class StopAtDigit7 {
             public static void main(String[] args) {
				//Print digits of a number but stop when digit is 7.
            	 int num =1278;
            	 for(int i=num; i>0; i=i/10 ) {
            		 int digit = i%10;
            		 if(digit==7) {
            			 break;
            		 }
            		 System.out.println(digit);
            	 }
			}
}
