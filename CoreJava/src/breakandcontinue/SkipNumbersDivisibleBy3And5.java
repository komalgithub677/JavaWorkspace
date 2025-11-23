package breakandcontinue;

public class SkipNumbersDivisibleBy3And5 {
             public static void main(String[] args) {
				//Print numbers 1–100 but skip numbers divisible by both 3 and 5.
            	 for(int i=1; i<=100; i++) {
            		 if(i%3==0 && i%5==0) {
            			 continue;
            		 }
            		 System.out.println(i);
            	 }
			}
}
