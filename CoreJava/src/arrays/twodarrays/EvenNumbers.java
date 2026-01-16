package arrays.twodarrays;

public class EvenNumbers {
             public void even(int arr[][]) {
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 if(arr[i][j]%2==0) {
            				 System.out.print("Even :" + arr[i][j]);
            			 }
            			 System.out.println();
            		 }
            	 }
             }
             
             public static void main(String[] args) {
            	 EvenNumbers e = new EvenNumbers();
            	 int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
            	 e.even(arr);
			}
}
