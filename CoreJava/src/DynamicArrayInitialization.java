import java.util.Scanner;

public class DynamicArrayInitialization {
	
	             public void maximum(float flo[]) {
	            	    float max = Integer.MIN_VALUE;
	            	    
	            	    for(int i=0; i<flo.length; i++) {
	            	    	if(flo[i]>max) {
	            	    		max =  flo[i];
	            	    	}
	            	    }
	            	    System.out.println("Max element : " + max);
	             }
	             
	             public void minimum(float flo[]) {
	            	    float min = Integer.MAX_VALUE;
	            	    
	            	    for(int i=0; i<flo.length; i++) {
	            	    	if(flo[i]<min) {
	            	    		min =  flo[i];
	            	    	}
	            	    }
	            	    System.out.println("Min element : " + min);
	             }
	
             public static void main(String[] args) {
//            	 PART 2: Dynamic Initialization – Array Questions
//            	 Q7️⃣
//
//            	 Declare an integer array of size 5 using dynamic initialization. 
//            	 Scanner sc = new Scanner(System.in);
//            	 int arr[] = new int[5];
//            	 
//            	 for(int i=0; i<arr.length; i++) {
//            		 arr[i] = sc.nextInt();
//            	 }
//            	 
//            	 for(int i=0; i<arr.length; i++) {
//            		 System.out.println(arr[i]);
//            	 }
            	 
//
//            	 Take values from the user
//
//            	 Print the array elements
//
//            	 Q8️⃣
//
//            	 Create a float array dynamically.
//
//            	 Accept values from the user
//
//            	 Find the maximum value in the array
            	
            	     

            	      
                         Scanner sc = new Scanner(System.in);
            	         float[] flo = new float[5];

            	         System.out.println("Enter 5 float values:");

            	         for (int i = 0; i < flo.length; i++) {
            	             flo[i] = sc.nextFloat();   // ✅ ONLY nextFloat
            	         }

            	         System.out.println("Array elements:");
            	         for (int i = 0; i < flo.length; i++) {
            	             System.out.println(flo[i]);
            	         }

            	         DynamicArrayInitialization  d = new DynamicArrayInitialization ();
            	         d.maximum(flo);
            	         d.minimum(flo);
            	         

            	 
//
//            	 Q9️⃣
//
//            	 Create a String array dynamically to store names of employees.
//
//            	 Take input from the user
//
//            	 Print names that start with a vowel
//
//            	 Q🔟 (Very Important)
//
//            	 Create a dynamic integer array and:
//
//            	 Count even and odd numbers separately
//
//            	 Q1️⃣1️⃣
//
//            	 Create a dynamic char array and:
//
//            	 Print only uppercase characters
//
//            	 Q1️⃣2️⃣ (Tricky)
//
//            	 Create an array of size 5 dynamically.
//
//            	 Try to access index 5
//
//            	 Observe and explain the exception
			}
}
