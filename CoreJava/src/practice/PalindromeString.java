package practice;

public class PalindromeString {
	
	         public void plaindromeString(String s) {
	        	 String original = s;
	        	 String rev ="";
	        	 for(int i=s.length()-1; i>=0; i--) {
	        		 rev = rev + s.charAt(i);
	        	 }
	        	 System.out.println("Reverse String : " + rev);
	        	 
	        	 if(original.equals(rev)) {
	        		 System.out.println("String is palindrome : " + s);
	        	 }
	        	 else {
	        		 System.out.println("String is not palindrome");
	        	 }
	         }
             public static void main(String[] args) {
				PalindromeString p = new PalindromeString();
				p.plaindromeString("aba");
			}
}
