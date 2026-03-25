package oops.pojo;

public class DiplomaCourse extends Course {

	
	

	public DiplomaCourse(String courseName, int duration) {
		super(courseName, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fees() {
		System.out.println("Diploma Course Fees:");
		return 30000;
	}
}
