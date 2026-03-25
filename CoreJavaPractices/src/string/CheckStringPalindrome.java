package string;

import java.util.Scanner;

public class CheckStringPalindrome {
             public void palindrome(String s) {
            	 
            	 String reverse ="";
            	 
            	 for(int i=s.length()-1; i>=0; i--) {
            		 reverse = reverse + s.charAt(i);
            	 }
            	 
            	 if(s.equals(reverse)) {
            		 System.out.println("String is palindrome");
            	 }
            	 else {
            		 System.out.println("String is not palindrome");
            	 }
             }
             
             public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				String s = sc.nextLine();
				CheckStringPalindrome c = new CheckStringPalindrome ();
				
				c.palindrome(s);
			}
}
