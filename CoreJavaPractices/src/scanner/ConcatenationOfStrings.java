package scanner;

import java.util.Scanner;

public class ConcatenationOfStrings {
             public void concatenation(String s1 , String s2) {
            	 String concat = s1 + s2;
            	 System.out.println("Concatenation of two Strings :" + concat);
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the First String :");
				String s1 = sc.nextLine();
				
				System.out.println("Enter the Second String : ");
				String s2 = sc.nextLine();
				
				ConcatenationOfStrings c = new ConcatenationOfStrings();
				c.concatenation(s1, s2);
			}
}
