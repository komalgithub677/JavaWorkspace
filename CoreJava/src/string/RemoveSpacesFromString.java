package string;

import java.util.Scanner;

public class RemoveSpacesFromString {
	         public void space(String s) {
	        	 
	        	 String result = "";
	        	 
	        	 for(int i=0; i<s.length(); i++) {
	        		if(s.charAt(i) != ' ') {
	        			result = result + s.charAt(i);
	        		}
	        	 }
	        
	        	 System.out.println(result);
	         }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				RemoveSpacesFromString r = new RemoveSpacesFromString();
				
				String s = "  Komal";
				
				String s1 = "Hello World";
				
				String result = s1.replace(" ", "");
				
				System.out.println(result);
				
				r.space(s);
				
				//String spaces removing  using String builder
				String s2 = "Hello Java";
				StringBuilder sb = new StringBuilder(s);
				for(char ch : s.toCharArray()) {
					if(ch != ' ') {
						sb.append(ch);
					}
				}
				System.out.println(sb.toString());	
			}
}
