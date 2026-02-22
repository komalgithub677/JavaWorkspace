import java.util.Arrays;
import java.util.Scanner;


public class QuestionsPractice {
	         public void fact(int n) {
	        	 int fact =1;
	        	 for(int i=1; i<=n; i++) {
	        		 fact *=i;
	        	 }
	        	 System.out.println("Factorial : " + fact);
	         }
	         
	         public void fibonacciNumber(int n) {
	        	 int a =0;
	        	 int b =1;
	        	 
	        	 for(int i=1; i<=n; i++) {
	        		 System.out.println(a + " ");
	        		 int c =a+ b;
	        		 a=b;
	        		 b =c;
	        	 }
	         }
	         
	         public void reverseNumber(int n) {
	        	 int rev =0;
	        	 for(int i=n; i>0; i=i/10) {
	        		 int digit = i%10;
	        		 rev = rev * 10 + digit;
	        	 }
	        	 
	        	 System.out.println("Reverse Number :" + rev);
	         }
	         
	         
	         public void palindromeNumber(int n) {
	        	 int rev =0;
	        	 for(int i=n; i>0; i=i/10) {
	        		 int digit = i%10;
	        		 rev = rev * 10 + digit;
	        	 }
	        	 
	        	 if(rev ==n) {
	        		 System.out.println("Number is palindrome");
	        	 }
	        	 else {
	        		 System.out.println("Number is not palindrome");
	        	 }
	         }
	         
	         public void armstrongNumber(int n) {
	        	 int sum =0;
	        	 
	        	 for(int i=n; i>0; i=i/10) {
	        		 int digit = i%10;
	        		 sum = digit * digit * digit;
	        	 }
	        	 if(sum == n) {
	        		 System.out.println("Armstrong number");
	        	 }
	        	 else {
	        		 System.out.println("Not a armstrong number");
	        	 }
	         }
	         
	         public void sumOfDigits(int n) {
	        	 int sum =0;
	        	 
	        	 for(int i=n; i>0; i=i/10) {
	        		 int digit = i%10;
	        		 sum +=digit;
	        	 }
	        	 System.out.println(sum);
	         }
	         
	         public void largestOfThreeNumbers(int a , int b , int c) {
	        	 if(a>b && a>c) {
	        		 System.out.println("Largest is a : ");
	        	 }
	        	 else if(b>a && b>c) {
	        		 System.out.println("Largest is b ");
	        	 }
	        	 else {
	        		 System.out.println("Largest is a : ");
	        	 }
	         }
	         
	         public int gcd(int a , int b) {
	        	 while(b!=0) {
	        		 int temp = b;
	        		 b =a%b;
	        		 a =temp; 
	        	 }
	        	 System.out.println("GCD : " + a);
				 return a;
	         }
	         
	         public void lcm(int a ,int b) {
	        	 int gcdValue = gcd(a,b);
	        	 int lcm = (a*b) /gcdValue;
	        	 
	        	 System.out.println("LCM : " + lcm);
//	        	 while(b!=0) {
//	        		 int temp = b;
//	        		 b =a % b;
//	        		 a = temp;
//	        	 }
//	        	 int lcm = (a * b) / a;
//	        	 System.out.println("LCM : " + lcm);
	         }
	         
	         public void leapYear(int year) {
	        	 if((year%4==0 && year%100!=0) || (year %400 ==0)) {
	        		 System.out.println("Leap year");
	        	 }
	        	 else {
	        		 System.out.println("Not a leap year");
	        	 }
	         }
	         
	         public void vowelConsonants(String str) {
	        	 int vowels =0;
	        	 int consonants =0;
	        	 
	        	 for(int i=0; i<str.length(); i++) {
	        		 char ch = str.charAt(i);
	        		 
	        		 if(ch =='a' || ch =='i' || ch=='o' || ch =='u' || ch=='e' || ch=='A' || ch =='I' || ch =='O' || ch=='U' || ch=='E') {
	        			 vowels ++;
	        		 }
	        		 else {
	        			 consonants++;
	        		 }
	        	 }
	        	 
	        	 System.out.println("Vowels : " + vowels);
	        	 System.out.println("Consonants : " + consonants);
	         }
	         
	         public void reverseString(String str) {
	        	 String reverse = " " ;
	        	 for(int i=str.length()-1; i>=0; i--) {
	        		 reverse = reverse + str.charAt(i); 
	        	 }
	        	 System.out.println("Reverse : " + reverse);
	         }
	         
	         public void anagrams(String s1 , String s2) {

	        	    s1 = s1.toLowerCase();
	        	    s2 = s2.toLowerCase();

	        	    char[] a = s1.toCharArray();
	        	    char[] b = s2.toCharArray();

	        	    Arrays.sort(a);
	        	    Arrays.sort(b);

	        	    if (Arrays.equals(a, b)) {
	        	        System.out.println("Anagrams");
	        	    } else {
	        	        System.out.println("Not anagrams");
	        	    }
	        	}
	         
	         public void removeDuplicates(String str) {
	        	 String result = "";
	        	 
	        	 for(int i=0; i<str.length(); i++) {
	        		 char ch = str.charAt(i);
	        		 
	        		 if(result.indexOf(ch) == -1) {
	        			 result +=ch;
	        		 }
	        	 }
	        	 System.out.println("String after removing duplicates : " + result);
	         }
	         
	         public void secondLargest(int arr[]) {
	        	 int max1 = Integer.MIN_VALUE;
	        	 int max2 = Integer.MIN_VALUE;
	        	 
	        	 for(int i=0; i<arr.length; i++) {
	        		 if(arr[i]>max1) {
	        			 max2 = max1;
	        			 max1 = arr[i];
	        		 }
	        		 else if(arr[i]>max2 && max1!=arr[i]) {
	        			 max2 =arr[i];
	        		 }
	        	 }
	        	 
	        	 System.out.println("First maximum : " + max1);
	        	 System.out.println("Second maximum : " + max2);
	         }
	         
	         public void linearSearch(int arr[] , int target) {
	        	for(int i=0; i<arr.length; i++) {
	        		if(arr[i]== target) {
	        			System.out.println("Element Found at index :  " + i);
	        			break;
	        		}
	        		
	        	}
	         }
	         
	         public void binarySearch(int arr[] ,int target) {
	        	 Arrays.sort(arr);
	        	 int n = arr.length;
	        	 int low =0; int high = n-1;
	        	 
	             boolean found = false;
	             
	             while(low<=high) {
	            	 int mid = (low + high)/2;
	            	 if(arr[mid] ==target) {
	            		 found = true;
	            		 break;
	            	 }
	            	 
	            	 else if(arr[mid]<target) {
	            		 low = mid + 1;
	            	 }
	            	 else {
	            		high =mid -1;
	            	 }
	            	
	             }
	             if(found == true) {
	            	 System.out.println("Element Found");
	             }
	             else {
	            	 System.out.println("Element not found");
	             }
	            
	             }
             
             public static void main(String[] args) {
				QuestionsPractice q = new QuestionsPractice();
				Scanner sc =new Scanner(System.in);
//				System.out.println("Enter your Number :");
//				int n =sc.nextInt();
//				
//				System.out.println("Enter the number a : ");
//				int a = sc.nextInt();
//				
//				System.out.println("Enter the number b :");
//				int b =sc.nextInt();
//				
//				System.out.println("Enter the number c :");
//				int c =sc.nextInt();
//				
//				System.out.println("Enter the year what you want : ");
//				int year = sc.nextInt();
//				
//				sc.nextLine();
				
				System.out.println("Enter the String 1 ");
				String str1 = sc.nextLine();
				
				System.out.println("Enter the String 2 ");
				String str2 = sc.nextLine();
				
				System.out.println("Enter your array");
				int arr[] = new int[5];
				
				for(int i=0; i<arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				
				
//				if(n%2==0) {
//					System.out.println("Even");
//				}
//				else {
//					System.out.println("Odd");
//				}
//				
//				//Check prime number
//				boolean isPrime = true;
//				
//				if(n<=1) {
//					isPrime =false;
//				}
//				
//				for(int i=2; i<=Math.sqrt(n); i++) {
//					if(n%i==0) {
//						isPrime =false;
//						break;
//					}
//				}
//				if(isPrime =true) {
//					System.out.println("Prime number");
//				}
//				else {
//					System.out.println("Not prime number");
//				}	
//				
//				//factorial
//				q.fact(n);
//				
//				//fibonacci number
//				q.fibonacciNumber(n);
//				
//				//reverse number
//				q.reverseNumber(n);
//				
//				//palindrome number
//				q.palindromeNumber(n);
//				
//				//Armstroong Number
//				q.armstrongNumber(n);
//				
//				//Sum of digits
//				q.sumOfDigits(n);
//				
//				//Largest Of three numbers
//				q.largestOfThreeNumbers(a, b, c);
//				
//				//greatest common divisor
//				q.gcd(a, b);
//				
//				//lcm of the numbers
//				q.lcm(a, b);
//				
//				//leap year checking
//				q.leapYear(a);
//				
				//vowels or consonants
				q.vowelConsonants(str1);
				
				//String reverse
				q.reverseString(str1);
				
				//anagrams check
				q.anagrams(str1, str2);
				
				//remove duplicates
				q.removeDuplicates(str2);
				
				//second largestElement
				q.secondLargest(arr);
				
				//linear search
				System.out.println("Enter the target what you want to search ");
				int target = sc.nextInt();
				q.linearSearch(arr, target);
				
				//Binary search
				q.binarySearch(arr, target);
				
}
}