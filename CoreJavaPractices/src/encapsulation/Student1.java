package encapsulation;

public class Student1 {
//	Create a Student class with private variables name and rollNo.
//	Write getters and setters and display the student details in main().
	private String name;
	private int rollNo ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getrollNo() {
		return rollNo;
	}
	public void setrollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
