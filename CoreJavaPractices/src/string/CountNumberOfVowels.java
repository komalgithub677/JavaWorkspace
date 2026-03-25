package string;

import java.util.Scanner;

public class CountNumberOfVowels {
	          public void countOfVowels(String s) {
	        	  int count =0;
	        	  for(int i=0; i<s.length(); i++) {
	        		  char ch = s.charAt(i);
	        		  if(ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E' || ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e' ) {
	        			  count++;
	        		  }
	        	  }
	        	  System.out.println("Count of vowel :" + count);
	          }
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 CountNumberOfVowels c = new CountNumberOfVowels();
            	 
            	 String s = sc.nextLine();
            	 
            	 c.countOfVowels(s);
            	 
				
			}
}
