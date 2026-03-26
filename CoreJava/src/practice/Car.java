package practice;

public class Car implements vehicle{

	@Override
	public void start() {
		System.out.println("this is implemented method");
		
	}
	
	public static void main(String[] args) {
		vehicle v = new Car();
		v.add();
		v.start();
		
	}

}
