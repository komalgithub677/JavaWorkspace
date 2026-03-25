package loops;

import java.util.Scanner;

public class PalindromeNumbers {
             public void palindromeNumber(int num) {
            	    int rev = 0;
            	    int originalNum = num;
            	    for(int i=num; i>0; i=i/10) {
            	    	int digit = i%10;
            	    	rev = rev*10 + digit;
            	  
            	    }
            	    
            	    if(rev == originalNum) {
            	    	System.out.println("Number is palindrome");
            	    }
            	    else {
            	    	System.out.println("Number is not palindorme");
            	    }
            	   
            	   
             }
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 int num = sc.nextInt();
				PalindromeNumbers p =new PalindromeNumbers();
				p.palindromeNumber(num);
				System.out.println("Number : " + num);
				
			}
}
