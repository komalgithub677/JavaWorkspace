package arrays.twodarrays;

public class SumOfArrayElements {
             public void sum(int arr[][]) {
            	 int sum=0; 
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			sum +=arr[i][j];
            		 }
            	 }
            	 System.out.println("Sum : " + sum);
             }
             
             public static void main(String[] args) {
            	 SumOfArrayElements s = new SumOfArrayElements();
            	 int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
            	 s.sum(arr);
			}
}
