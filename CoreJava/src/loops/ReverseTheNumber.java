package loops;

public class ReverseTheNumber {
             public static void main(String[] args) {
				int num =121;
				int rev =0;
				for(int i=num; i>0; i=i/10) {
					int lastdigit = i%10;
				    rev = rev * 10 + lastdigit;	
				    if(rev ==num) {
				    	System.out.println("Revse number is palindrome number : " + rev);
				    }
				    
				}
				System.out.println("Rverse Number : " + rev);
			}
}
