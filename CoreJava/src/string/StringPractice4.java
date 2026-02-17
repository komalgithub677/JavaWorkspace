package string;

public class StringPractice4 {
             public static void main(String[] args) {
				String s = "Komal";
				String s1 ="Disha";

//Print each character of a string on a new line. 
				for(int i=0; i<s.length(); i++) {
					System.out.println(s.charAt(i));
				}
//Find length of string using length() method. 
				System.out.println(s.length());
//Convert string to uppercase. 
				System.out.println(s.toUpperCase());
//Convert string to lowercase. 
				System.out.println(s.toLowerCase());
//Check whether two strings are equal or not. 
				System.out.println(s.equals(s1));
//Concatenate two strings without using + operator.
				System.out.println(s.concat(s1));
//Check whether a string contains the word "Java".
				System.out.println(s.contains("Java"));
//Find the first and last character of a string.
				char first = s.charAt(0);
				char last = s.charAt(s.length()-1);
				
				System.out.println(first);
				System.out.println(last);
				
				
//				on the Basis of StringBuilder & StringBuffer : 
//
//					Create a StringBuilder with text "Hello" and append " Java".
				 StringBuilder sb = new StringBuilder("Hello");
				 sb.append("Java");
				 System.out.println(sb);
//					Create a StringBuilder and insert the word "Java" in the middle of a sentence.
//					Reverse a string using StringBuilder.
//					Replace the word "Java" with "Python" using StringBuilder.
//					Delete characters from index 2 to 5 using StringBuilder.
//					Convert String to StringBuilder and modify it.
//					Count the number of characters using StringBuilder (without length()).
//					Check whether the string is palindrome using StringBuilder reverse().


			}
}
