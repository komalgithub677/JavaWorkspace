package multithreading;

public class TwoThreads extends Thread{
             public void run() {
            	 System.out.println("This is the run method of the thread class");
             }
             
             public static void main(String[] args) {
				TwoThreads t1 = new TwoThreads();
				TwoThreads t2 = new TwoThreads();
				
				t1.start();
				t2.start();
			}
}
