
public class Citizen {
private final long adhaarNumber ;
	
	public Citizen(long adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}
	
	public long getadhaarNumber() {
		return adhaarNumber;
	}
//	Create a write-only class Login with a private password variable.
//
//	Create a class Car where speed cannot exceed 120 km/h using setter validation.
//
//	Encapsulate a static variable companyName inside a class.
//
//	Create an encapsulated class where values are initialized using a constructor.
//
//	Write a program showing why direct access to variables is not allowed.
//
//	Create a fully encapsulated Product class and test it in another class.
	
	public static void main(String[] args) {
		Citizen c = new Citizen(8978685745637l);
		
		System.out.println("AdhaarNumber : " + (c.getadhaarNumber()));
		
	}
}
