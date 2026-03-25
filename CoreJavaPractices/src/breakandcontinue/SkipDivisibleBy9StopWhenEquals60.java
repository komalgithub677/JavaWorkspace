package breakandcontinue;

public class SkipDivisibleBy9StopWhenEquals60 {
             public static void main(String[] args) {
				//Print multiples of 3, skip when number divisible by 9, stop when reaching 60.
            	 for(int i=1; i<=10 ;i++) {
            		 int multipleOf3= i*3;
            		 if( multipleOf3%9==0) {
            			 continue;
            		 }
            		 if( multipleOf3==60) {
            			 break;
            		 }
            		 System.out.println(multipleOf3);
            	 }
			}
}
