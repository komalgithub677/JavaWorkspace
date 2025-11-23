package breakandcontinue;

public class SkipDivisibleby10 {
              public static void main(String[] args) {
				//Print multiples of 2 but skip when number is divisible by 10.
            	  for(int i=1; i<=10; i++) {
            		  int MultiplesOf2 = i*2;
            		  if(MultiplesOf2%10==0) {
            			  continue;
            		  }
            		  System.out.println(MultiplesOf2);
            	  }
			}
}
