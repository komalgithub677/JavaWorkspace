package practice;

public class ThreadPriority extends Thread  {
             public void run() {
            	 System.out.println("Thread name : " + Thread.currentThread().getName() 
            			 + "Thread Priority " + Thread.currentThread().getPriority());
            	 
             }
             
             public static void main(String[] args) {
				ThreadPriority t1 = new ThreadPriority();
				ThreadPriority t2 = new ThreadPriority();
				ThreadPriority t3 = new ThreadPriority();
				
				//set name to the threads
				t1.setName("Low Priority");
				t2.setName("Normal Prority Thread");
				t3.setName("High Priority Thread ");
				
				//Set the priorities
				t1.setPriority(Thread.MIN_PRIORITY);
				t2.setPriority(Thread.NORM_PRIORITY);
				t3.setPriority(Thread.MAX_PRIORITY);
				
				//Start thread
				t1.start();
				t2.start();
				t3.start();
				
				
				
			}
}
