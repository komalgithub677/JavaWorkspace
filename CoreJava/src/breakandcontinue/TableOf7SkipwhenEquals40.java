package breakandcontinue;

public class TableOf7SkipwhenEquals40 {
              public static void main(String[] args) {
				//Print table of 7 but stop when product becomes greater than 40.
            	  for(int i=1; i<=10; i++) {
            		  int product =i*7;
            		  if(product>40) {
            			 break;
            		  }
            		  System.out.println(product);
            	  }
			}
}
