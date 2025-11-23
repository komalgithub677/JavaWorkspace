package breakandcontinue;

public class SkipPerfectSquare {
              public static void main(String[] args) {
				//Print numbers 1–60 but skip perfect squares (1, 4, 9...).
            	  for(int i=1; i<=60; i++) {
            		  int root = (int) Math.sqrt(i);
            		  
            		  if( root * root == i) {
            			  continue;
            		  }
            		  System.out.println(i);
            	  }
			}
}
