package string;

import java.util.Scanner;

public class ReverseString {
             public void reverse(String s) {
            	 String reverse = "" ;
            	 for(int i=s.length()-1; i>=0; i--) {
            		 reverse = reverse + s.charAt(i);
            	 }
            	 
            	 System.out.println(reverse);
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				ReverseString r =new ReverseString ();
				
				String s = sc.nextLine();
			    r.reverse(s);
			}
}
