package encapsulation;

public class Students {
//	Create a class Student with private variables id and name.
//	Provide public getter and setter methods to set and get the values.
//	Display the student details in the main method.
	private int Student_id;
	private String name;
	
	
	public int getStudent_id() {
		return Student_id;
	}
	
	public void setStudent_id(int Student_id) {
		this.Student_id= Student_id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.setStudent_id(12);
		System.out.println("Student Id : " + s.getStudent_id());
		s.setname("Komal");
		System.out.println("Student Name : " + s.getname());
	}
	
	
}
