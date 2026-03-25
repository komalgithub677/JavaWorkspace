package loops;

import java.util.Scanner;

public class PalindromeNumberChecking {
             public int palindromeCheck(int num) {
            	 int rev = 0;
            	 
            	 for(int i=num; i>0; i=i/10) {
            		 int digit = i%10;
            		 rev = rev*10 +digit;
                     
            	 }
            	 if(num == rev) {
            		 System.out.println("Number is plaindrome");
            	 }
            	 else {
            		 System.out.println("Number is not plaindrome");
            	 }
            	 
            	 return num;
             }
             
             
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 int num = sc.nextInt();
            	 PalindromeNumberChecking p = new PalindromeNumberChecking();
            	System.out.println( p.palindromeCheck(num));
			}
}
