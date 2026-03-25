package oops.abstraction;

public class Child implements Parent1 , Parent2 {
    
	@Override
	public void surName() {
		System.out.println("My surname is Narawade");
		
	}
    
	@Override
	public void coocking() {
	System.out.println("Khichdi .... ");	
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.coocking();
		c.surName();
	}          
}
