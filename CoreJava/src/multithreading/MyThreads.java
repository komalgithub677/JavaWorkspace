package multithreading;

public class MyThreads extends Thread {
	                   //override run method
                       public void run() {
                    	   for(int i=1; i<=10; i++) {
                    		   System.out.println("2's table " + 2*i);
                    		   try {
								sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                    		System.out.println("Thread name : " + getName());
                    	   }
                       }
                       
                       
                       
                       public static void main(String[] args) {
						MyThreads m =new MyThreads();
						Thread t = Thread.currentThread();
						System.out.println(t.getName());
						
						//set name 
						t.setName("My Thread");
						m.run();
					}
                       
}
