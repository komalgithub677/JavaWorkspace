package arrays.twodarrays;

public class oddElements {
               public void odd(int arr[][]) {
            	   for(int i=0; i<arr.length; i++) {
            		   for(int j=0; j<arr[i].length; j++) {
            			   if(arr[i][j]%2!=0) {
            				   System.out.print(arr[i][j]);
            			   }
            		   }
            		   System.out.println();
            	   }
               }
               
               public static void main(String[] args) {
            	   oddElements  o = new oddElements ();
            	   int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
            	   
            	   o.odd(arr);
			}
}
