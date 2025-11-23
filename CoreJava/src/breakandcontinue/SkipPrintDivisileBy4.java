package breakandcontinue;

public class SkipPrintDivisileBy4 {
              public static void main(String[] args) {
				//Print numbers from 1–100 but print “SKIP” if divisible by 4.
            	  for(int i=1; i<=100; i++) {
            		  if(i%4==0) {
            			  System.out.println("Skip");
            		  }
            		  System.out.println(i);
            	  }
			}
}
