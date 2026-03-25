package breakandcontinue;

public class SkipEverySeventhNumber {
              public static void main(String[] args) {
				//Print numbers 1–100 but skip every 7th number.
            	  for(int i=1; i<=100; i++) {
            		  if(i%7==0) {
            			  continue;
            		  }
            		  System.out.println(i);
            	  }
			}
}
