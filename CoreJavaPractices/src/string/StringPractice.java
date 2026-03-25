package string;

public class StringPractice {
             public static void main(String[] args) {
				String s = "   Komal   ";
				
				
//				Find the length of a given string.
				System.out.println("String length :" + s.length());
//
//				Print each character of a string using charAt().
				for(int i=0; i<s.length(); i++) {
					System.out.println("char : " + s.charAt(i));
				}
//
//				Convert a string to uppercase.
				System.out.println("Uppercase " + s.toUpperCase());
//
//				Convert a string to lowercase.
				System.out.println("LowerCase : " + s.toLowerCase());
//
//				Remove leading and trailing spaces from a string.
				System.out.println("Trailing leading spaces removal : " + s.trim());
//
//				Check whether a string is empty or not.
				System.out.println("String Empty : " + s.isEmpty());
//
//				Check whether a string contains a given word.
				System.out.println(s.contains(s));
//
//				Compare two strings using equals() and equalsIgnoreCase().
				String s1 = "Komal";
				String s2 = "Komal";
				
				System.out.println("String equality : " + s1.equals(s2));
				System.out.println("String equality : " + s1.equalsIgnoreCase(s2));
//
//				Find the first occurrence of a character in a string.
				String s3 = "Narawade";
				char ch = 'N';
				int index = s.indexOf(ch);
				
				if(index!=-1) {
					System.out.println("First occurece of " + ch + "is at index : " + index);
				}
				else {
					System.out.println("Character not found");
				}
//
//				Find the last occurrence of a character.
				String s4 ="Komal";
				String word = "Java";
				
				int index1 = s.lastIndexOf(word);
				
				System.out.println("Last ocuurence of " + word + "" +  index1);
				
			}
}
