
public class Encapsulatedclass {
//	Create an encapsulated class where values are initialized using a constructor.
	private int id ;
	
	public Encapsulatedclass(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static void main(String[] args) {
		Encapsulatedclass e = new Encapsulatedclass(101);
		
		System.out.println("Id : " + (e.getId()));
	}
}
