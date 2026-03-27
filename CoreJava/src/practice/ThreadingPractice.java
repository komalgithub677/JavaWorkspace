package practice;

public class ThreadingPractice extends Thread {
              public void run() {
            	  System.out.println("Run method");
              }
              
              public static void main(String[] args) {
            	  ThreadingPractice t = new ThreadingPractice();
            	  t.start();
			}
}
