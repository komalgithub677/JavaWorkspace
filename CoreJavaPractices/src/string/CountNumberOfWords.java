package string;

import java.util.Scanner;

public class CountNumberOfWords {
             public void numberOfWords(String s) {
            	
            	 int count =0;
            	 
            	 for(int i=0; i<s.length(); i++) {
            		 if((i==0 && s.charAt(i)!=' ') || (s.charAt(i)!=' ' && s.charAt(i-1) == ' ')) {
            			 count++;
            		 }
            	 }
            	 
            	 System.out.println("Word Count :"  + count);
            	 
             }
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 CountNumberOfWords c = new CountNumberOfWords();
            	 String s = sc.nextLine();
            	 c.numberOfWords(s);
            	 
            	 
			}
}
