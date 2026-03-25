package breakandcontinue;

public class StopMultiplesDivisibleBy15 {
             public static void main(String[] args) {
				//Print the first 20 multiples of 3, but stop if multiple divisible by 15.
            	 for(int i=1; i<=20; i++) {
            		 int multiples = i*3;
            		 if(multiples%15==0) {
            			 break;
            		 }
            		 System.out.println(multiples);
            	 }
			}
}
