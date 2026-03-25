package oops.contructor;

public class Employees {
//	3. Create a class Employee with private salary.
//	Add validation in setter: salary must be > 0, otherwise print error.**
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Error");
		}
		
	}
	
	
}
