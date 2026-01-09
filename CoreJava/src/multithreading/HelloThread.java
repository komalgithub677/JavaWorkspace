package multithreading;

public class HelloThread extends Thread {
//	Write a program to print “Hello from Thread class” using Thread.
	public void run() {
		System.out.println("This is the helloThread class...");
	}
	
	public static void main(String[] args) {
		HelloThread h =new HelloThread();
		h.start();
	}
}


