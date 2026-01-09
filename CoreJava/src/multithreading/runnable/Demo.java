package multithreading.runnable;

public class Demo extends War implements Runnable{

	@Override
	public void run() {
		System.out.println("This is the run method of the Runnable ");
		
	}
	
	public void display() {
		System.out.println("This is the display method of the demo class");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.show();
		
		Thread t = new Thread();
		t.start();
	}
}
