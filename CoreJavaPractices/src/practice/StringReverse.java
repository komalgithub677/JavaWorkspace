package practice;

public class StringReverse {
              public void stringReverse(String s) {
            	  String rev =" "; 
            	  for(int i=s.length()-1; i>=0; i--) {
            		  rev = rev + s.charAt(i);
            	  }
            	  System.out.println("Rverse String : " + rev);
              }
              
              public static void main(String[] args) {
				StringReverse s = new StringReverse();
				s.stringReverse("Komal");
			}
}
