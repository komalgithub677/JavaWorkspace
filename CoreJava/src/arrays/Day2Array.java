package arrays;

public class Day2Array {
       public static void main(String[] args) {
    	   
    	   //print array
    	   int num []= {23,45,67,54,24,12,34,88};
           System.out.println("Print array : ");
           for(int i=0; i<num.length; i++) {
        	   System.out.println(num[i]);
           }
           
           //reverse array
           System.out.println("Reverse Array : ");
           for(int i=num.length-1; i>=0; i--) {
        	   System.out.println(num[i]);
           }
           
           //sum of array elements
           int sum=0;
           
           for(int i=0; i<num.length; i++) {
        	   sum +=num[i];
           }
           System.out.println("Sum of array elements  : " +sum);
           
           //largest elements
           int max = num[0];
           
           for(int i=0; i<num.length; i++) {
        	   if(num[i]>max) {
        		   max = num[i];
        	   }
        	   
           }
           System.out.println("Max Element : " + max);
           
           //smallest element
           int min = num[0];
           
           for(int i=0; i<num.length; i++) {
        	   if(num[i]<min) {
        		   min = num[i];
        	   }
           }
           
           System.out.println("Minimum Element : " + min);
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
	}
}
