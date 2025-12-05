package oops.contructor;

public class EmployeesInfo {
             public static void main(String[] args) {
				Employees e = new Employees();
				e.setSalary(30000.00);
				System.out.println("Salary would be :" + e.getSalary());
				
				e.setSalary(-30000.00);
			}
}
