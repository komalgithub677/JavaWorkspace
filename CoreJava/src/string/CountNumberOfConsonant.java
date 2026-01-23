package string;

import java.util.Scanner;

public class CountNumberOfConsonant {
	         public void consonant(String s) {
	        	 int count =0;
	        	 for(int i=0; i<s.length(); i++) {
	        		 char ch = s.charAt(i);
	        		 if(ch!='A' || ch!='I' || ch!='O' || ch!='U' || ch!='E' || ch!='a' || ch!='i' || ch!='o' || ch!='u' || ch!='e' ) {
	        			  count++;
	        		  }
	        	 }
	        	 System.out.println("Count of consonant: " + count);
	         }
            public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				String s = sc.nextLine();
				
				CountNumberOfConsonant c = new CountNumberOfConsonant ();
				c.consonant(s);
			}
}
