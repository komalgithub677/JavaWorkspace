package src.Infosys;

import java.util.Scanner;

public class Pq2 {
       public void maxSubArraySum(int numbers[]) {
    	   int currSum =0;
    	   int maxSum = Integer.MIN_VALUE;
    	   
    	      for(int i=0; i<numbers.length; i++) {
    	    	  int start = i;
    	    	  for(int j=i; j<numbers.length; j++) {
    	    		  int end = j;
    	    		 currSum =0;
    	    		  for(int k=start; k<=end; k++) {
    	    			  currSum +=numbers[k];
    	    		  }
    	    		  
    	    		  System.out.println(currSum);
    	    		  if(maxSum<currSum) {
    	    			  maxSum = currSum;
    	    		  }
    	    		  
    	    	  }
    	    	 
    	      }
    	      System.out.println("Maximum Sum : " + maxSum);
       }
       
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   Pq2 p = new  Pq2();
    	   int numbers[] = new int[5];
    	   for(int i=0; i<numbers.length; i++) {
    		   numbers[i] = sc.nextInt();
    	   }
    	   
    	   p.maxSubArraySum(numbers);
	}
}
