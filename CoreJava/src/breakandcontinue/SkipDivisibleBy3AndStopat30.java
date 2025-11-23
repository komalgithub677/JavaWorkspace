package breakandcontinue;

public class SkipDivisibleBy3AndStopat30 {
             public static void main(String[] args) {
				//
            	// Print numbers 1 to 100 but skip numbers divisible by 3 and stop when number becomes 30
            	 for(int i=1; i<=100; i++) {
            		 if(i%3==0) {
            			 continue;
            		 }
            		 if(i==30) {
            			 break;
            		 }
            		 System.out.println(i);
            	 }
			}
}
