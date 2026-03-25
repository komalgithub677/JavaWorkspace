import java.util.Scanner;

public class QuestionsPraactice {
             public void sort(int arr[]) {
            	 boolean isSorted = false;
            	 for(int i=0; i<arr.length-1; i++) {
            		 if(arr[i]>arr[i+1]) {
            			 isSorted = true;
            			 break;
            		 }
            	 }
            	 if(isSorted =true) {
            		 System.out.println("Array is sorted");
            	 }
            	 else {
            		 System.out.println("Array is not sorted");
            	 }
             }
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 QuestionsPraactice q = new QuestionsPraactice();
            	 System.out.println("Enter your array : ");
            	 int arr[] = new int [5];
            	 for(int i=0; i<arr.length; i++) {
            		 arr[i] = sc.nextInt();
            	 }
            	 q.sort(arr);
			}
}
