package breakandcontinue;

public class StopAtNumberDivisible3And7 {
              public static void main(String[] args) {
				// Print numbers from 1 to 100 but stop if a number is divisible by both 3 and 7. (Use break)
            	  for(int i=1; i<=100; i++) {
            		  if(i%3==0 && i%7==0) {
            			  break;
            		  }
            		  System.out.println(i);
            	  }
			}
}
