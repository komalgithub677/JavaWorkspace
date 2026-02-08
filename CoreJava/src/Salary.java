
public class Salary {
//	Create an Employee class where salary cannot be set below 10,000
//	(use validation inside setter).
	private int emp_id;
	private double salary;
	
	public int getempId() {
		return emp_id;
	}
	
	public void setempId(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if(salary>=10000) {
			this.salary =salary;
		}
		else {
			System.out.println("Salary must be greater than 10000");
		}
	}
	
	public static void main(String[] args) {
		Salary s = new Salary();
		
		System.out.println("Salary of employee");
		s.setSalary(20000);
		System.out.println("Salary : " + (s.getsalary()));
	}
	
}
