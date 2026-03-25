package arrays.twodarrays;

import java.util.Arrays;

public class Day4 {
      public static void main(String[] args) {
		int [][]num = {{10,20,50},{70,30,60}};
		//Rows 2
		//Columns 3
		
		//10 20 50
		//70,30,60
		
		System.out.println(num[1][1]);
		System.out.println(num[0][1]);
//		System.out.println(num[2][1]);//array index out of bound exception
		System.out.println(num[1][1]);
		
		String [][]names = {{"ram" ,"om" ,"shyam"},{"rahul","yash","priya"}};
		
		//rahul
		System.out.println(names[1][0]);
		
		//priya
		System.out.println(names[1][2]);
		
		//om
		System.out.println(names[0][1]);
		
		//shyam
		System.out.println(names[0][2]);
		
		int nums[][] ={{10,20,50,70,30},{70,30,60,60,0}};
		
		System.out.println(nums[0][2]);
		
//		System.out.println(nums[1][3]);//index out of bound exceptions
		
		int num1[][] ={{10,20,50,70,30},{70,30,60,60,0}};
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1[i].length; j++) {
				System.out.print(num1[i][j]+" ");
			}
			System.out.println();
		}
		
		//inbuilt method 
		
		System.out.println(Arrays.deepToString(num1));
	}
}
