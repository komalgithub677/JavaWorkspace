package breakandcontinue;

public class StopAt56 {
              public static void main(String[] args) {
				// Print all even numbers from 1 to 100, and stop when you get the number 56. (Use break)
            	  for(int i=1; i<=100; i++) {
            		  if(i%2==0) {
            			  if(i==56) {
            				  break;
            			  }
            			  System.out.println(i);
            		  }
            	  }
			}
}
