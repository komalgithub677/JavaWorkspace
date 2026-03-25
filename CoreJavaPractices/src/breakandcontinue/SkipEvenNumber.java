package breakandcontinue;

public class SkipEvenNumber {
              public static void main(String[] args) {
				//Print odd numbers from 1 to 100 but stop when you get an even number.
            	  for(int i=1; i<=100; i++) {
            		  if(i%2==0) {
            			  continue;
            		  }
            		  System.out.println(i);
            	  }
			}
}
