package oops.practicequestions;

import java.util.Scanner;

public class Employee extends Person {
             double salary;

			public Employee(String name, int age, double salary) {
				super(name, age);
				this.salary = salary;
			}

			@Override
			public String toString() {
				return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]";
			}

			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				
				System.out.println("Employee name");
				String name = sc.nextLine();
				
				System.out.println("Employee age :");
				int age = sc.nextInt();
				
				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();
				
				Employee e = new Employee(name ,age ,salary);
				System.out.println("Employees Details :");
				System.out.println(e);
			}
             
}
