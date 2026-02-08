
public class Devloper extends Employee {

	public Devloper(double salary) {
		super(salary);
	}

	@Override
	public double calculatedSalary() {
		return salary + 5000; // bonus
		
	}
             
}
