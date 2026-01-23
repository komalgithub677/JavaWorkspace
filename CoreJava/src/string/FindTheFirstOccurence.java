package string;

import java.util.Scanner;

public class FindTheFirstOccurence {
	         public void occurence(String s , char target) {
	        	  for(int i=0; i<s.length(); i++) {
	        		  char ch =s.charAt(i);
	        		  if(ch == target) {
	        			  System.out.println("Taget found:  " + target  + " At index : " + i);
	        			 return;
	        		  }
	        		  
	        	  }
	        	  System.out.println("Target not found : ");
	        	    
	         }
	         
	         
             public static void main(String[] args) {
//            	 Find the first occurrence of a given character.
            	 Scanner sc =new Scanner(System.in);
            	 
            	 System.out.println("Enter the String to find :");
            	 String s = sc.nextLine();
            	 
            	 System.out.println("Enter the character to found : ");
            	 char ch = sc.next().charAt(0);
            	 
            	 FindTheFirstOccurence f = new FindTheFirstOccurence();
            	 f.occurence(s,ch );
            	 
			}
}
