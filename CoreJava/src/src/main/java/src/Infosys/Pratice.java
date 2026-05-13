package src.Infosys;

import java.util.Scanner;

public class Pratice {
             public void swap(int a ,int b) {
            	 boolean isSwap = true;
            	 int temp = a;
            	 a = b;
            	 b =temp;
            	 
            	a==b ? true : false;
            	 
            	 System.out.println(a);
            	 System.out.println(b);
             }
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 Pratice p = new Pratice();
            	 int a = sc.nextInt();
            	 int b = sc.nextInt();
            	 p.swap(a, b);
			}
}
