package arrays;

import java.util.Scanner;

public class SecondSmallestElement {

    public void secondSmallest(int arr[]) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } 
            else if (arr[i] > min1 && arr[i] < min2) {
                min2 = arr[i];
            }
        }
        
        if(min2 == Integer.MAX_VALUE) {
        	System.out.println("max2 value does not exist ");
        }

        System.out.println("First minimum : " + min1);
        System.out.println("Second minimum : " + min2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter your array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        SecondSmallestElement s = new SecondSmallestElement();
        s.secondSmallest(arr);
    }
}
