
public class TcsQuestionsPractice {
//	1. IF–ELSE Questions
//	Basic
//	Check whether a number is positive, negative, or zero.
    public void number(int num) {
    	if(num>0) {
    		System.out.println("Number is positive");
    	}
    	else if(num<0){
    		System.out.println("Number is negative");
    	}
    	else {
    		System.out.println("Number is zero");
    	}
    }
//	Find the largest of two numbers.
    public void largest(int a , int b) {
    	if(a>b) {
    		System.out.println("Number a is greater");
    	}
    	else {
    		System.out.println("Number b is greater");
    	}
    }
//	Check if a number is even or odd.
    public void evenOdd(int num) {
    	if(num%2==0) {
    		System.out.println("Number is even");
    	}
    	else {
    		System.out.println("Number is odd");
    	}
    }
//	Check whether a person is eligible to vote (age ≥ 18).
    public void age(int age) {
    	if(age>=18) {
    		System.out.println("person is eligible to vote ");
    	}
    	else {
    		System.out.println("Person is not eligible to vote");
    	}
    }
//	Moderate
//	Find the largest of three numbers.
    public void largestOfThree(int a , int b , int c) {
    	if(a>b && a>c) {
    		System.out.println("Number a is greater");
    	}
    	else if(b>a && b>c) {
    		System.out.println("Number b is greater");
    	}
    	else {
    		System.out.println("Number c is greater");
    	}
    }
//	Check whether a year is a leap year.
    public void leapYear(int year) {
    	if((year%4==0 && year%400==0)&& (year%100!=0)) {
    		System.out.println("Year is leap year");
    	}
    	else {
    		System.out.println("Year is not leap year");
    	}
    }
//	Grade a student based on marks:
//	≥90 → A
//	≥75 → B
//	≥50 → C
//	else Fail
    
    public void gradeDistribution(int marks) {
    	if(marks>=90) {
    		System.out.println("Grade A");
    	}
    	else if(marks>=75) {
    		System.out.println("Grade B");
    	}
    	else if(marks>=50) {
    		System.out.println("Grade c");
    	}
    	else {
    		System.out.println("Fail");
    	}
    }
//	Tricky
//	Check if a number is divisible by both 3 and 5.
    public void numberDivisibility(int num) {
    	if(num%3==0 && num%5==0) {
    		System.out.println("Number is divisible by 3 and 5");
    	}
    	else {
    		System.out.println("Number is not divisible by 3 and 5");
    	}
    }
//	Find whether a character is vowel or consonant.
//	Check if a number is a palindrome (e.g., 121).
//	🔹 2. LOOPS Questions
//	Basic (for / while)
//	Print numbers from 1 to 100.
//	Print even numbers from 1 to N.
//	Find sum of first N natural numbers.
//	Print multiplication table of a number.
//	Moderate
//	Find factorial of a number.
//	Reverse a number (e.g., 123 → 321).
//	Count digits in a number.
//	Find sum of digits of a number.
//	Tricky
//	Check if a number is prime.
//	Print Fibonacci series up to N terms.
//	Print pattern:
//	*
//	**
//	***
//	****
//	Print pyramid:
//	   *
//	  ***
//	 *****
//	🔹 3. METHODS (Functions)
//	Basic
//	Write a method to add two numbers.
//	Write a method to check even/odd.
//	Write a method to find square of a number.
//	Moderate
//	Write a method to find factorial using function.
//	Write a method to check prime number.
//	Write a method to return the largest of 3 numbers.
//	Tricky
//	Write a method for Fibonacci using recursion.
//	Write a method to reverse a number.
//	Write a method to check palindrome string.
//	🔹 4. STRING Questions
//	Basic
//	Count number of characters in a string.
//	Convert string to uppercase/lowercase.
//	Reverse a string.
//	Moderate
//	Check if a string is palindrome.
//	Count vowels and consonants in a string.
//	Remove all spaces from a string.
//	Tricky
//	Count frequency of each character.
//	Find first non-repeating character.
//	Check if two strings are anagrams.
//	🔹 5. ARRAYS Questions
//	Basic
//	Find sum of elements in an array.
//	Find maximum and minimum element.
//	Print array elements in reverse.
//	Moderate
//	Count even and odd numbers in array.
//	Search an element (Linear Search).
//	Sort an array (Bubble Sort).
//	Tricky
//	Find second largest element.
//	Remove duplicates from array.
//	Find missing number in array (1 to N).
//	🔹 6. COLLECTION FRAMEWORK Questions
//	List (ArrayList)
//	Store 5 numbers in an ArrayList and print them.
//	Find sum of elements in ArrayList.
//	Remove duplicates from ArrayList.
//	Set (HashSet)
//	Store elements and check uniqueness.
//	Find intersection of two sets.
//	Map (HashMap)
//	Count frequency of elements using HashMap.
//	Store student name and marks using HashMap.
//	Find the key with maximum value.
//	🔥 BONUS (TCS / Placement Level Mix)
//	Find missing number in array (important).
//	Find duplicate elements in array.
//	Reverse words in a sentence.
//	Check if string contains only digits.
//	Rotate array by K positions.
public static void main(String[] args) {
	
}
}
