package oops.pojo;

import java.util.Scanner;

public class MainCourse {
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				//Student
				System.out.println("Enter Student id  : ");
				int id  = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter the student name");
				String name = sc.nextLine();
				
				//course selection
				System.out.println("Choose course type :");
				System.out.println("1.Degree Course");
				System.out.println("2.Diploma Course:");
				int choice = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Course name :");
				String courseName = sc.nextLine();
				
				System.out.println("Enter Course Duration (months) : ");
				int duration = sc.nextInt();
				
				Course course = null;
				
				if(choice ==1) {
					course = new DegreeCourse(courseName , duration);
				}
				else if(choice == 2) {
					course = new DiplomaCourse(courseName , duration);
				}
				else {
					System.out.println("Invalid choice");
				}
				Student student = new Student(id ,name ,course );
				
				System.out.println("Student course Details :");
				System.out.println(student);
			}
}
