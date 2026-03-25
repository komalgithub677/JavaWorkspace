
public class Students {
//	Create a Student class with private variables id, name, marks.
//	Use getters and setters and display the details.
	
	private int id;
	private String name;
	private int marks;
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id =id;
	}
	
	public String  getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks =marks;
	}
	
	
	public static void main(String[] args) {
		Students s = new Students();
		s.setid(101);
		System.out.println("Id : " + (s.getid()));
		
		System.out.println("Students name ");
		s.setName("Komal");
		System.out.println("Name: " + (s.getName()));
		
		System.out.println("Students Marks :");
		s.setMarks(78);
		System.out.println("Marks : " + (s.getMarks()));
	}
	
	
}
