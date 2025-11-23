package breakandcontinue;

public class SkipDigitSum5 {
             public static void main(String[] args) {
				//Print numbers 1–100 but skip numbers whose digit sum is 5.
            	 for(int i=1; i<=100; i++) {
            		 int digitSum = 0;
            		 int num = i;
            		 while(num>0) {
            			 digitSum +=num%10;
            			 num /=10;
            		 }
            	     if(digitSum==5) {
            	    	 continue;
            	     }
            	     System.out.println(i );
            	
            }
			}
}
