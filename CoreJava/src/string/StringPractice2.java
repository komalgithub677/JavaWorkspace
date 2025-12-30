package string;

import java.util.Arrays;

public class StringPractice2 {
//	INTERMEDIATE STRING QUESTIONS
//
//	Count the number of vowels in a string using charAt() and length().
	public static void main(String[] args) {
		String s ="Komal";
		int count =0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch =='A' | ch=='E' | ch=='I' | ch=='U' | ch=='O' | ch =='a' | ch=='e' | ch=='i' | ch=='o' | ch=='e') {
				count++;
			}
			
		}
		System.out.println(count);
	
//
//	Reverse a string using charAt().
	String s1 ="Komal";
	String reverse = "" ;
    
	for(int i=s1.length()-1; i>0 ; i--) {
		reverse = reverse + s1.charAt(i);
	}
	
	System.out.println("Rverse String : " + reverse);
	
	
	
//
//	Check whether a string is a palindrome.
	String s4 = "aba";
	String reverse1 ="";
	
	for(int i=s4.length()-1; i>=0; i--) {
		reverse1= reverse1+s4.charAt(i);
	}
	
	if(s4.equals(reverse1)) {
		System.out.println("String is palindrome " + s4);
	}
	else {
		System.out.println("String is not palindrome");
	}
	
//
//	Count the number of words in a string using split().
//
	String s5 ="Komal Narawade";
	s = s5.trim();
	
	String words[] = s.split("");
	int cnt = words.length;
	
	System.out.println("Count of words in a String : " + cnt);
	
	
//	Replace all spaces in a string with -.
	String s6 = "Java is Easy";
	
	String result = s6.replaceAll(".", " ");
	
	System.out.println("Original  : [ " + s6 + "]  ");
	System.out.println("Result : [ " + result + " ] ");
	
//
//	Extract a substring from a given string.
	String s7 = "Komal Narawade";
	System.out.println(s7.substring(8));
//
//	Check whether a string starts with a given prefix.
	String s8 = "Komal";
	System.out.println(s8.startsWith("K"));
//
//	Check whether a string ends with a given suffix.
	String s9 = "Narawade";
	System.out.println(s9.endsWith("e"));
//
//	Check whether two strings are anagrams (basic).
	String s10 = "listen";
	String s11 = "silent";
	
	s10 = s10.replace("", "") .toLowerCase();
	s11 = s11.replace("", "").toLowerCase();
	
	if(s10.length() !=s11.length()) {
		System.out.println("Strings are not anagrams");
		return;
	}
	
	char []a1 =s10.toCharArray();
	char []a2 =s11.toCharArray();
	
	Arrays.sort(a1);
	Arrays.sort(a2);
	
	if(Arrays.equals(a1 , a2)) {
		System.out.println("Strings are anagrams ");
	}
	else {
		System.out.println("Strings are not anagrams");
	}
	
//
//	Count the frequency of a character in a string.
	String s12 = "Narawade";
	int cnt2 = 0;
	
	for(int i=0; i<=s12.length()-1; i++) {
		cnt2++;
	}
	System.out.println("Count of characters in String : " + cnt2);
}
}