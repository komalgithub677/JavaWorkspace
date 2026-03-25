package oops.pojo;

public class DegreeCourse extends Course {


	public DegreeCourse(String courseName, int duration) {
		super(courseName, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fees() {
		System.out.println("Fees for DegreeCourse : ");
		return 50000;
	}
             
}
