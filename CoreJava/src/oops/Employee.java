package oops;

public class Employee {
	public int employee_id;
	public String employee_name;
	public String employee_department;
	public long employee_mobNo;
	public String employee_email;
	public String employee_address;
	public int employee_age;
	public float employee_salary;
	public int employee_dept_id;
	public int employee_dateofjoining;
	public int employee_experienceyear;
	public String employee_status;
	
	
       public static void main(String[] args) {
		Employee emp = new Employee();
		
		System.out.println(emp.employee_name);
		System.out.println(emp.employee_address);
		System.out.println(emp.employee_age);
		System.out.println(emp.employee_dateofjoining);
		System.out.println(emp.employee_department);
		System.out.println(emp.employee_dateofjoining);
		System.out.println(emp.employee_dept_id);
		System.out.println(emp.employee_email);
		System.out.println(emp.employee_experienceyear);
		System.out.println(emp.employee_id);
		System.out.println(emp.employee_mobNo);
		System.out.println(emp.employee_salary);
		
	}
}
