package practice;

public class Practice3 {
//	Q6. Print numbers from 1 to 100.
	public void printOneTo100(int num) {
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}
	
//	Q7. Print even numbers from 1 to 100.
	public void printEvenNumbers(int num) {
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				System.out.println("Even number");
			}
			else {
				System.out.println("Odd number");
			}
		}
	}
//	Q8. Find the factorial of a number.
	public void factorial(int num) {
		int fact =1;
		for(int i=1; i<=num; i++) {
			fact *=i;
		}
		System.out.println("Factorial of Number : " + fact);
	}
//	Input: 5
//	Output: 120
//	Q9. Check whether a number is Prime.
//	Input: 13
//	Output: Prime
	
	public void prime(int num) {
		   
	}
	
//	Q10. Print Fibonacci Series.
//	Input: 10
//
//	Output:
//	0 1 1 2 3 5 8 13 21 34
//	Phase 3: Pattern Programs
//	Q11.
//	*
//	**
//	***
//	****
//	*****
//	Q12.
//	*****
//	****
//	***
//	**
//	*
//	Q13.
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//	Q14.
//	1
//	12
//	123
//	1234
//	12345
//	Q15.
//	A
//	AB
//	ABC
//	ABCD
//	ABCDE
//	Phase 4: String Programs
//	Q16. Reverse a String.
//	Input: "Java"
//	Output: "avaJ"
	public void reverseString() {
		   String reverse = "";
		   
		   
	}
//	Q17. Check whether a String is Palindrome.
//	Input: "madam"
//	Output: Palindrome
//	Q18. Count vowels and consonants.
//	Input: "Hello"
//
//	Output:
//	Vowels = 2
//	Consonants = 3
//	Q19. Count occurrences of each character.
//	Input: "programming"
//	Q20. Remove duplicate characters from a String.
//	Input: "programming"
//	Output: "progamin"
//	Phase 5: Arrays
//	Q21. Find largest element in array.
//	int[] arr = {10,20,5,40,30};
//	Q22. Find second largest element.
//	Q23. Find smallest element.
//	Q24. Reverse an array.
//	Q25. Sort an array without using Arrays.sort().
//	Q26. Find duplicate elements.
//	{1,2,3,2,4,5,1}
//	Q27. Remove duplicates from array.
//	Q28. Find missing number.
//	{1,2,3,5}
//	Output: 4
//	Q29. Merge two arrays.
//	Q30. Find frequency of each element.
//	Phase 6: OOPs
//	Q31. Create a Student class with:
//	id
//	name
//	marks
//
//	Create objects and display data.
//
//	Q32. Demonstrate Constructor Overloading.
//	Q33. Demonstrate Method Overloading.
//	Q34. Demonstrate Method Overriding.
//	Q35. Difference between:
//	Class
//	Object
//	Constructor
//
//	Explain with example.
//
//	Q36. Create an Abstract Class and implement it.
//	Q37. Create an Interface and implement it.
//	Q38. Multiple inheritance using Interface.
//	Q39. Demonstrate Encapsulation.
//	Q40. Demonstrate Polymorphism.
//	Phase 7: Collections Framework
//	Q41. Store 5 names in ArrayList and print them.
//	Q42. Sort ArrayList.
//	Q43. Remove duplicates using HashSet.
	
	public static void main(String[] args) {
		Practice3 p = new Practice3();
		
	}
}
