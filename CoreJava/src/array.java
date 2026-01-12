
public class array {
       public static void main(String[] args) {
//    	   Q1️⃣
//
//    	   Create an integer array using static initialization and print all elements using a for loop.
		int arr[] = {34,25,26,17,18};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		Q2️⃣
//
//		Create a double array with 5 elements using static initialization and:
//
//		Print the length of the array
//
//		Print the first and last element	
		
		double arr1[] = {23.12,12.23,12,34,34.24};
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
//		Q3️⃣
//
//		Create a String array using static initialization that stores 4 student names and print them using:
//
//		for loop
//
//		enhanced for-each loop	
		
		String []names = {"Komal" ,"Sonali" ,"Snehal","Shital"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
//		
//		
//		Q4️⃣
//
//		Create a char array using static initialization and print only vowels from the array.
//
//		Q5️⃣ (Important)
		
		char []letters = {'a' ,'B' ,'C','D'};
		
		for(int i=0; i<letters.length; i++) {
			System.out.println(letters[i]);
		}
//
//		Create a boolean array using static initialization and count how many true values are present.
//
//		Q6️⃣
		boolean []contains = {true ,false};
		
		for(int i=0; i<contains.length; i++) {
			System.out.println(contains[i]);
		}
		
//
//		Create an integer array using static initialization and:
//
//		Find the sum of all elements
//
//		Find the average of the elements
		
		int numbers[] = {23,45,56,67,87};
		int sum =0;
		for(int i=0 ;i<numbers.length; i++) {
			sum +=arr[i];
		}
		System.out.println("Sum :" + sum);
		System.out.println("Average : " + sum/numbers.length);
//		
//		
	}
}
