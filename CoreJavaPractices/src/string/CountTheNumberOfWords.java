package string;

import java.util.Scanner;

public class CountTheNumberOfWords {
             public void count(String s) {
            	 int count =0;
            	 for(int i=0; i<s.length(); i++) {
            		char ch = s.charAt(i);
            		count++;
            	 }
            	 
            	 System.out.println("Count of characters : " + count);
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				CountTheNumberOfWords c = new CountTheNumberOfWords();
				c.count(s);
			}
}



