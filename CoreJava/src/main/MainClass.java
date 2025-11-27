package main;

import oops.Employee;
public class MainClass {
      public static void main(String[] args) {
		Employee emp = new Employee();
		String name = emp.employee_name ="Disha";
		int age = emp.employee_age =22;
		String department = emp.employee_department ="Entc";
		float salary = emp.employee_salary = 30000;
		String email = emp.employee_email = "dish14@gmail.com";
		int year = emp.employee_experienceyear = 13;
		long mobile = emp.employee_mobNo = 8849747777l;
		
		System.err.println("Employee Details:");
		System.out.println(emp);
		System.out.println(name);
		System.out.println(age);
		System.out.println(department);
		System.out.println(salary);
		System.out.println(email);
		System.out.println(year);
		System.out.println(mobile);
		
		Employee emp1 = new Employee();
		String name1 = emp1.employee_name ="Komal";
		int age1 = emp1.employee_age =22;
		String department1 = emp1.employee_department ="CS";
		float salary1 = emp1.employee_salary = 30000;
		String email1 = emp1.employee_email = "knarawade4@gmail.com";
		int year1 = emp1.employee_experienceyear = 2;
		long mobile1 = emp1.employee_mobNo = 9373937250l;
		
		System.err.println("Employee 2 Details:");
		System.out.println(emp1);
		System.out.println(name1);
		System.out.println(age1);
		System.out.println(department1);
		System.out.println(salary1);
		System.out.println(email1);
		System.out.println(year1);
		System.out.println(mobile1);
		
		
		Employee emp2 = new Employee();
		String name2 = emp2.employee_name ="Komal";
		int age2 = emp2.employee_age =22;
		String department2 = emp2.employee_department ="CS";
		float salary2 = emp2.employee_salary = 30000;
		String email2 = emp2.employee_email = "knarawade4@gmail.com";
		int year2 = emp2.employee_experienceyear = 2;
		long mobile2 = emp2.employee_mobNo = 9373937250l;
		
		System.err.println("Employee 3 Details:");
		System.out.println(emp2);
		System.out.println(name2);
		System.out.println(age2);
		System.out.println(department2);
		System.out.println(salary2);
		System.out.println(email2);
		System.out.println(year2);
		System.out.println(mobile2);
	}
       
}
