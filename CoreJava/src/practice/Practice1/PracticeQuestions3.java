package practice.Practice1;

import java.util.Scanner;

public class PracticeQuestions3 {
//	Print the reverse of a string using loop (without inbuilt methods).
	public void reverseString(String s) {
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse String : " + reverse);
	}
//
//	Count vowels and consonants in a string using loop.
	
	public void vowelConsonant() {
		char ch ='a';
		if(ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E' || ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e') {
			System.out.println("Character is Vowel :" + ch);
		}
		else {
			System.out.println("Character is consonant");
		}
	}
//
//	Find duplicate characters in a string using loop.
	public void findDuplicateChars(String s) {

	    char[] ch = s.toCharArray();

	    System.out.println("Duplicate characters:");

	    for (int i = 0; i < ch.length; i++) {

	        if (ch[i] == ' ') continue; // skip spaces

	        int count = 1;

	        for (int j = i + 1; j < ch.length; j++) {
	            if (ch[i] == ch[j]) {
	                count++;
	                ch[j] = '0'; // mark visited
	            }
	        }

	        if (count > 1 && ch[i] != '0') {
	            System.out.println(ch[i] + " -> " + count);
	        }
	    }
	}

//
//	Check whether a string is Palindrome using loop.
	public void palindromeString(String s) {
		String original = s;
		
		String reverse = "" ;
		for(int i=s.length()-1; i>0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
//
//	Find the frequency of each character in a string.
	public void freq(String s) {
		int []freq = new int[256];
		
		for(int i=1; i<s.length()-1; i++) {
			char ch = s.charAt(i);
			freq[ch]++;
		}
		
		System.out.println("Count frequency :");
		
		for(int i=0; i<256; i++) {
			if(freq[i]>0 && i!= ' ') {
				System.out.println((char) i + " " + freq);
			}
		}
	}
//
//	Remove spaces from a string using loop.
	public void removeSpaces(String s) {
		String result = " " ;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				result = result + s.charAt(i);
			}
			
		}
		System.out.println("Result = " + result);
	}
	
	public static void main(String[] args) {
		PracticeQuestions3 p = new PracticeQuestions3();
		Scanner sc = new Scanner(System.in);
		String s = "      Komal";
		p.reverseString(s);
		
		p.vowelConsonant();
		
		p.findDuplicateChars(s);
		
		p.palindromeString(s);
		
		p.freq(s);
		
		p.removeSpaces(s);
	}
}
