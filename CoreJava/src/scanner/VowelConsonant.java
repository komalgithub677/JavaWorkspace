package scanner;

import java.util.Scanner;

public class VowelConsonant {
             public void vowelConsonant(char ch) {
            	 if(ch =='a' || ch=='i' || ch=='u' || ch=='e' || 
            		ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E' ) {
            		 System.out.println("Character is Vowel");
            	 } else {
            		 System.out.println("Character is consonant");
            	 }
             }
             public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				
				System.out.println("Enter the character as your wish : ");
				char ch = sc.next().charAt(0);
				
				VowelConsonant vc = new VowelConsonant();
				vc.vowelConsonant(ch);
				
				
			}
}
