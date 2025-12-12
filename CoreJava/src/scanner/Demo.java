package scanner;

import java.util.Scanner;

public class Demo {
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your age");
				int a = sc.nextInt();
				
				System.out.println("Age is : " );
				byte b = sc.nextByte();
				
				String name = sc.nextLine();
				System.out.println("Enter your name is : " + name );
				
				System.out.println("Enter your marks");
				System.out.println("Byte : " +b);
			}
}
