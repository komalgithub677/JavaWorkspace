package oops.practicequestions;

import java.util.Scanner;

public class Student {
             private int id;
             private String name;
             private double percentage;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getPercentage() {
				return percentage;
			}
			public void setPercentage(double percentage) {
				this.percentage = percentage;
			}
			public Student(int id, String name, double percentage) {
				super();
				this.id = id;
				this.name = name;
				this.percentage = percentage;
			}
             
			@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
			}
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the student id :");
				int id = sc.nextInt();
				
				sc.nextLine();
				
				
				System.out.println("Enter the student name:");
				String name = sc.nextLine();
				
				System.out.println("Enter the students Percentage : ");
				double percentage = sc.nextDouble();
				
			    Student s = new Student(id , name , percentage);
			    
			    System.out.println("Students Details : " );
			    System.out.println(s);
				
			}
             
}
