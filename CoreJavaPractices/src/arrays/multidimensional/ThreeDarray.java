package arrays.multidimensional;

public class ThreeDarray {
//	Declare and initialize a 3D array.
	public void threeDArrayDeclaration(int arr[][][]) {
		System.out.println("Three D  matrix : ");
		        for(int i=0; i<arr.length; i++) {
		        	for(int j=0; j<arr[i].length; j++) {
		        		for(int k=0; k<arr[i][j].length; k++) {
		        			System.out.print(arr[i][j][k] + " ");
		        		}
		        		System.out.println();
		        	}
		        }
	}
	
	public static void main(String[] args) {
		ThreeDarray t = new ThreeDarray();
		
		 int arr[][][] = {{{10,20,40,56,76},{11,23,34,35,45},{12,23,24,25,26}}};
		 
		 t.threeDArrayDeclaration(arr);
	}
}
