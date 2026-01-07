package multithreading;

public class MyThreads extends Thread {
	                   //override run method
                       public void run() {
                    	   for(int i=1; i<=10; i++) {
                    		   System.out.println("2's table " + 2*i);
                    	   }
                       }
                       
                       public static void main(String[] args) {
						MyThreads m =new MyThreads();
						m.run();
					}
}
