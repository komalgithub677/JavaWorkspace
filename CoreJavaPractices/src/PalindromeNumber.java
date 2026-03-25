
public class PalindromeNumber {
             public static void main(String[] args) {
				
            	 int num = 313;
            	 int originalNum = num;
            	 int rev = 0;
            	 
//            	 num =1;
            	 while(num>0) {
            		 int digit = num%10;
            		 rev = rev*10 + digit;
            		 num = num/10;
            	 }
            	if(originalNum==rev) {
            		System.out.println("Number is palindrome number");
            	}
            	else {
            		System.out.println("Number is not palindrome number");
            	}
			}
}
