package practice;

public class Tests  extends Animal1{
	
	public void sound() {
		System.out.println("This is the implemented method of the abstract class");
	}
	
	public static void main(String[] args) {
		Animal1 a = new Tests();
		a.sound();
	}
}


