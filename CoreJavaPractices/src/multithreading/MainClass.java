package multithreading;

public class MainClass {
       public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread();
		t.start();//it calls run method
		t.m1();
		t1.start();
		
//		for(int i=11; i<=20; i++) {
//			System.out.println("Main class : " + i);
//		}
		
		
	}
}
