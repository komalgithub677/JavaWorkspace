package string;

import java.util.Scanner;

public class LastOccurence {
             public void lastOccurence(String s , char target) {
            	 for(int i=s.length()-1;  i>=0; i--) {
            		 char ch = s.charAt(i);
            		 if(ch==target) {
            			 System.out.println("Character found At : " + target + "   Index " + i);
            			 return;
            		 }
            	 }
            	 System.out.println("Character not found ");
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        
				System.out.println("Enter your String :");
				String s = sc.nextLine();
				
				System.out.println("Enter the character to found : ");
				char ch = sc.next().charAt(0);
				LastOccurence l =new LastOccurence();
				l.lastOccurence(s, ch);
			}
}


