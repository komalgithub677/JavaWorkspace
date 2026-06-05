package practice;

public class Car1 extends Practice {

	public void start() {
		System.out.println("This is the start method of the car class");
	}
	
	public static void main(String[] args) {
		Practice p = new Car1();
		p.start();
	}

}


