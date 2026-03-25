package arrays.twodarrays;

public class CountOfOdd {
             public void count(int arr[][]) {
            	 int oddCount =0;
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 if(arr[i][j]%2!=0) {
            				 oddCount++;
            			 }
            		 }
            	 }
            	 
            	 System.out.println("Odd Count : " + oddCount);
             }
             
             public static void main(String[] args) {
				CountOfOdd c = new CountOfOdd();
				int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
				c.count(arr);
			}
}
