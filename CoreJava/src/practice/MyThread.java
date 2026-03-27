package practice;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("this is the run method");
		
	}
	
	public static void main(String[] args) {
		 MyThread obj = new MyThread();
		 Thread t1 = new Thread(obj);
		 t1.start();
	}

}
