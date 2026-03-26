package practice;

public class EncapsulationPractice {
//	🔵 3. Encapsulation (VERY IMPORTANT)
//	Create a class with private variables and use getters/setters
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
//	Hide data and access using methods
//	Validate data using setters (e.g., age cannot be negative)
//	Create a class where data cannot be modified directly
	
	public static void main(String[] args) {
		EncapsulationPractice e  = new EncapsulationPractice();
		e.setId(1);
		System.out.println("id :" + (e.getId()));
		e.setName("Komal");
		System.out.println("name :" + (e.getName()));
	}
}
