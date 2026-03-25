package scanner;

import java.util.Scanner;

public class PersonalInfo {
	// Take name and age from user and display them.
	public void personalDetail(String name , int age ) {
		System.out.println("Name of user :" + name);
		System.out.println("Age of user :" + age);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your Name :");
		String name = sc.nextLine();
		
		PersonalInfo p = new PersonalInfo();
		p.personalDetail(name, age);
	}
}
