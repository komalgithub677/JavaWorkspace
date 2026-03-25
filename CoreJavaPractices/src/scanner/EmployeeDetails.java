package scanner;

import java.util.Scanner;

public class EmployeeDetails {
	         int emp_id;
	         String name;
	         float salary;
	         
	         // Take employee name, id, and salary and print employee details.
             public void employeeDetails(int emp_id , String name , float salary) {
            	        System.out.println("Employee id would be : " + (this.emp_id = emp_id));
            	        System.out.println("Employee name : " + (this.name = name));
            	        System.out.println("Employee Salary : " + (this.salary =salary));         
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter your id : ");
				int emp_id = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter your name : ");
				String name = sc.next();
				
				System.out.println("Enter your salary : ");
				float salary = sc.nextFloat();
				
				EmployeeDetails e = new EmployeeDetails();
				e.employeeDetails(emp_id, name, salary);
				
				
			}
}
