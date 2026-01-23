package string;

import java.util.Scanner;

public class StringPractice1 {
              public static void main(String[] args) {
//            	  Write a program to create a String and print it.
            	  String s = "Komal";
            	  System.out.println("String Value : " + s);
//
//            	  Take a string input from the user and display it.
            	  Scanner sc = new Scanner(System.in);
            	  String s1 = sc.nextLine();
            	  System.out.println(s1);
//
//            	  Find the length of a string.
            	  s1.length();
            	  System.out.println(s1.length());
//
//            	  Print each character of a string using a loop.
            	  for(int i=0 ; i<s.length(); i++) {
            		  System.out.println(s.charAt(i));
            	  }
//
//            	  Check whether a string is empty or not.
            	  System.out.println(s.isEmpty());
			}
}
