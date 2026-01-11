package practice.Practice1;

import java.util.Scanner;

public class Printnumbers1ToN {
             public void print(int n) {
            	 for(int i=1;i <=n; i++) {
            		 System.out.println(i);
            	 }
             }
             
             public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the number : ");
				int n = sc.nextInt();
				Printnumbers1ToN p = new Printnumbers1ToN();
				p.print(n);
				
				
			}
}
