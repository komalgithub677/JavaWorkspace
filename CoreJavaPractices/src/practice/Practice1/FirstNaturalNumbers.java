package practice.Practice1;

import java.util.Scanner;

public class FirstNaturalNumbers {
             public void natural(int n) {
            	 for(int i=1; i<=n; i++) {
            		 System.out.println(i);
            	 }
             }
             
             public static void main(String[] args) {
				FirstNaturalNumbers f = new FirstNaturalNumbers();
				Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
				f.natural(0);
			}
}
