package string;

public class StringPracticeQuestions {
                           public static void main(String[] args) {
//                        	   Practise Problems Base on String : 
//
//                        		   Basic Program base on string : 
//
//                        		   Print each character of a string on a new line. 
                        	   String s = "Komal";
                        	   for(int i=0; i<=s.length()-1; i++) {
                        		   System.out.println("Char : " + s.charAt(i));
                        	   }
                        	   
//                        		   Find length of string using length() method. 
                        	   System.out.println("Length of String : " + s.length());
//                        		   Convert string to uppercase. 
                        	   System.out.println("Uppercase : " + s.toUpperCase());
//                        		   Convert string to lowercase. 
                        	   System.out.println("LowerCase : " + s.toLowerCase());
//                        		   Check whether two strings are equal or not. 
                        	   String s1 = "java";
                        	   String s2 = "java";
                        	   System.out.println("Strings equality : "+ s1.equals(s2));
//                        		   Concatenate two strings without using + operator.
                        	   System.out.println("String concatenate : " + s1.concat(s2));
//                        		   Check whether a string contains the word "Java". 
                        	   System.out.println("String Contains java : "+s.contains("Java"));
                        	   
//                        		   Find the first and last character of a string.
						}
}
