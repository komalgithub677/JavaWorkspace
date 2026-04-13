import java.util.Scanner;

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
    public void chararacterChecking(char c) {
    	if(c=='a' || c=='i' || c=='o' || c=='u' || c=='e') {
    		System.out.println("vowel");
    	}
    	else {
    		System.out.println("Consonant");
    	}
    }
//	Check if a number is a palindrome (e.g., 121).
    public void palindromeNumber(int num) {
    	int rev = 0;
    	int original = num;
    	
    	System.out.println("Original number : " + num);
    	
    	for(int i=num; i>0; i=i/10) {
    		int digit = i%10;
    		rev = rev * 10 + digit;
    		digit++;
    	}
    	
    	System.out.println("Reverse number : " + rev);
    	if(original ==rev) {
    		System.out.println("Number is palindrome");
    	}
    	else {
    		System.out.println("Number is not palindrome");
    	}
    }
//	🔹 2. LOOPS Questions
//	Basic (for / while)
//	Print numbers from 1 to 100.
    public void printinumbers(int num) {
    	for(int i=0; i<=num; i++) {
    		System.out.println(i);
    	}
    }
//	Print even numbers from 1 to N.
    public void evenNumberPrinting(int num) {
    	for(int i=1; i<=num; i++) {
    	  if(i%2==0) {
    		  System.out.println(i);
    	  }
    	}
    }
//	Find sum of first N natural numbers.
    public void Natural(int n) {
    	int sum = n* (n+1)/2;
    	for(int i=1; i<=n; i++) {
    		if(n%2==0) {
    			break;
    		}
    		sum += i;
    	}
    	System.out.println(sum);
    }
//	Print multiplication table of a number.
    public void multiplicationTable(int num) {
    	
    	for(int i=1; i<=10; i++) {
    		System.out.println(num + " * " + i + " = " + (num*i));
    	}
    	
    	
    }
//	Moderate
//	Find factorial of a number.
    public void factorial(int num) {
    	int fact = 1;
    	for(int i=1; i<=num; i++) {
    		fact *=i;
    	}
    	System.out.println("Factorial of a number : " + fact);
    }
//	Reverse a number (e.g., 123 → 321).
    public void reverseNumber(int num) {
    	int rev = 0;
    	for(int i=num; i>0; i=i/10) {
    		int digit = i%10;
    		rev = rev * 10 + digit;
    	}
    	
    	System.out.println("Reverse Number : " + rev);
    }
//	Count digits in a number.
    public void countDigits(int num) {
    	int digitCount =0;
    	for(int i=num; i>0; i=i/10) {
    		int digit = i%10;
    		digitCount++;
    	}
    	
    	System.out.println("DigitCount " + digitCount);
    }
//	Find sum of digits of a number.
    public void sumOfDigits(int num) {
    	int sum =0;
    	for(int i=num; i>0; i=i/10) {
    		int digit = i%10;
    		sum +=digit;
    	}
    	System.out.println("Sum of digits : " + sum);
    }

    
//	Print Fibonacci series up to N terms.
    public void fibonacciSeries(int n) {
    	int a = 0;
    	int b=1;
    	
    
    	
    	System.out.println("a : " + a + " b : " +  b);
    	for(int i=2; i<n; i++) {
    		int next = a + b;
    		System.out.println(next + " ");
    		a =b;
    		b=next;
    	}
    }
//	Print pattern:
//	*
//	**
//	***
//	****
    
    public void pattern(int num) {
    	for(int i=1; i<=num; i++) {
    		for(int j=i+1; j<=i; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
//	Print pyramid:
//	   *
//	  ***
//	 *****
    public void pyramid(int n) {
    	for (int i = 1; i <= n; i++) {

    	    // spaces
    	    for (int j = 1; j <= n - i; j++) {
    	        System.out.print(" ");
    	    }

    	    // stars
    	    for (int j = 1; j <= (2 * i - 1); j++) {
    	        System.out.print("*");
    	    }

    	    System.out.println();
    	}
    }
//	🔹 3. METHODS (Functions)
//	Basic
//	Write a method to add two numbers.
    public void add(int a , int b) {
    	System.out.println("Addition of two numbers :");
    	System.out.println(a + b);
    }
    
//	Write a method to check even/odd.
    public void evenOdd1(int num) {
    	if(num%2==0) {
    		System.out.println("Number is even");
    	}
    	else {
    		System.out.println("Number is odd");
    	}
    }
    
//	Write a method to find square of a number.
    public void square(int num) {
    	int square = num * num ;
    	System.out.println(square);
    }
//	Moderate
//	Write a method to find factorial using function.
    public void factorial1(int num) {
    	int fact = 1;
    	
    	for(int i=1; i<=num; i++) {
    		fact *=i;
    	}
    	
    	System.out.println("Factorial of number : " + fact);
    }
//	Write a method to check prime number.
    
    public void primeNumber(int num) {
    	boolean isPrime = true;
    	
    	if(num<=1) {
    		isPrime = false;
    	}
    	for(int i=2; i<Math.sqrt(num); i++) {
    		if(num%2==0) {
    			isPrime = false;
    			break;
    		}
    	}
    }
//	Write a method to return the largest of 3 numbers.
    public void largest(int a , int b , int c) {
    	if(a>b && a>c) {
    		System.out.println("a is largest");
    	}
    	else if(b>a && b>c) {
    		System.out.println("b is largest");
    	}
    	else {
    		System.out.println("c is largest");
    	}
    }
//	Tricky
//	Write a method for Fibonacci using recursion.
    public void fibonacci(int num) {
    	int a = 0;
    	int b =1;
    	
    	System.out.println("a " + a + " b " + b);
    	for(int i=0; i<=num; i++) {
    		int next = a + b;
    		a = b;
    		b =next;
    	}
    }
//	Write a method to reverse a number.
    public void reverse(int num) {
    	int rev = 0;
    	for(int i=num; i>0; i++) {
    		int digit = num % 10;
    		rev = rev * 10 + digit ;
    	}
    	System.out.println("Revrse number  : " + rev);
    }
//	Write a method to check palindrome string.
    
    public void palindrome(int num) {
    	int original = num;
    	int rev = 0;
    	for(int i=num; i>0; i++) {
    		int digit = i%10;
    		rev = rev * 10 + digit;
    	}
    	if(rev == original) {
    		System.out.println("Number is palindrome");
    	}
    	else {
    		System.out.println("Number is not palindrome");
    	}
    }
//	🔹 4. STRING Questions
//	Basic
//	Count number of characters in a string.
    public void countCharacters(String s) {
    	int count = 0;
    	for(int i=0; i<s.length(); i++) {
    		char ch = s.charAt(i);
    		count++;
    	}
    	System.out.println(count);
    }
//	Convert string to uppercase/lowercase.
    public void sToUppercase(String s) {
           
    	System.out.println(	"String in uppercase : " + s.toUpperCase());
    	System.out.println(s);
    	
    	System.out.println("String in lowerCase : " + s.toLowerCase());
    	System.out.println(s);
  	
    }
//	Reverse a string.
    
    public void reverse(String s) {
    	String rev = " ";
    	
    	for(int i=s.length()-1;  i>=0; i--) {
    		rev = rev + s.charAt(i);
    	}	
    	System.out.println("Reverse String : " + rev);
    }
//	Moderate
    
//	Check if a string is palindrome.
    public void StringPalindrome(String s) {
    	String original = s;
    	String rev = " " ;
    	
    	for(int i=s.length()-1; i>=0; i-- ) {
    		rev = rev + s.charAt(i);
    	}
    	
    	if(original.equals(rev)) {
    		System.out.println("String is palindrome");
    	}
    	else {
    		System.out.println("String is not palindrome");
    	}
    }
    
    
//	Count vowels and consonants in a string.
    
    public void vowelsConsonants(String s) {
    	        char c = s.charAt(0);
    	        
    	        int Vowelscount = 0;
    	        int  consonantCount = 0;
    	        
    	        if(c=='a' || c =='i' || c=='o' || c=='u' || c=='e' || c=='A' || c=='I' || c=='U' || c=='E') {
    	        	Vowelscount++;
    	        }
    	        else {
    	        	consonantCount++;
    	        }
    	        
    	        System.out.println(Vowelscount);
    	        System.out.println(consonantCount);        
    }
    
//	Remove all spaces from a string.
    public void spaces(String s) {
    	String result = "" ;
    	
    	for(int i=0; i<s.length(); i++) {
    		if(s.charAt(i) !=' ') {
    			result = result + s.charAt(i);
    		}
    	}
    	System.out.println(result);
    }
//	Tricky
//	Count frequency of each character.
    public void frequency(String s) {
    	int freqCount = 0;
    }
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
	TcsQuestionsPractice t = new TcsQuestionsPractice();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
	t.palindromeNumber(num);
	
	System.out.println("Printing numbers form the 1 to 100");
	t.printinumbers(num);
	
	System.out.println("Even numbers");
	t.evenNumberPrinting(num);
	t.Natural(num);
	
	t.multiplicationTable(num);
	
	t.factorial(num);
	
	t.reverseNumber(num);
	
	t.countDigits(num);
	t.sumOfDigits(num);
	
	t.fibonacciSeries(num);
	
	t.pattern(num);
	
	t.pyramid(num);
	
	int a = sc.nextInt();
	
	int b =sc.nextInt();
	t.add(a, b);
	
	t.square(num);
	
	t.reverseNumber(num);
	
	t.palindromeNumber(num);
	
	String s = sc.nextLine();
	
	t.countCharacters(s);
     }
}
