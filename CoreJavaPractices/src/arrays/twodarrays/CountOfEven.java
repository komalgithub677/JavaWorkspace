package arrays.twodarrays;

public class CountOfEven {
             public void count(int arr[][]) {
            	 int evenCount =0;
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 if(arr[i][j]%2==0) {
            				 evenCount++;
            			 }
            		 }
            	 }
            	 
            	 System.out.println("Even Count : " + evenCount);
             }
             
             public static void main(String[] args) {
				CountOfEven c = new CountOfEven();
				int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
				c.count(arr);
			}
}
