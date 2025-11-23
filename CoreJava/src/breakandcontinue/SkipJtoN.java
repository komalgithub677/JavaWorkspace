package breakandcontinue;

public class SkipJtoN {
              public static void main(String[] args) {
				// Print all characters from A to Z but skip the letters from J to N. (Use continue)
            	  for(char ch='A'; ch<='Z'; ch++) {
            		  if(ch>='J'&& ch<='N') {
            			  continue;
            		  }
            		  System.out.println(ch);
            	  }
			}
}
