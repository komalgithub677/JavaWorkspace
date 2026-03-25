package string;

import java.util.Scanner;

public class StringContainsAlphabet {
	          public void alphabet(String s) {
	        	  for(int i=1 ;i<s.length(); i++) {
	        		  s.toLowerCase();
	        		  char ch = s.charAt(i);
	        		  
	        		  if(ch>='a'  && ch<='z') {
	        			  System.out.println("Contains only aplhabets : " + ch);
	        		  }
	        		  if(ch>='0' && ch<='9') {
	        			  System.out.println("Contains digits also : " + ch);
	        		  }
	        	  }
	          }
              public static void main(String[] args) {
            	  
            	  Scanner sc =new Scanner(System.in);
            	  
            	 System.out.println("Enter your String : ");
            	  String s = sc.nextLine();
            	  StringContainsAlphabet s1 = new StringContainsAlphabet();
            	  s1.alphabet(s);;
            	  
            	  
			}
}
