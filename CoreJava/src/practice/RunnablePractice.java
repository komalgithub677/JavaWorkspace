package practice;

public class RunnablePractice implements Runnable{
	//Difference between start and the run method
	//start()- Start method is used to call the run method and creates new thread internally
	//Run()- Run method contains the actual logic 
             public void run() {
            	    System.out.println("This is the run method : ");
            	    
            	    for(int i=1; i<=10; i++) {
            	    	System.out.println("i : " + i);
            	    }    
             }
             
             public static void main(String[] args) {
				RunnablePractice r = new RunnablePractice();
				Thread t = new Thread(r);
				t.start();
				
			}
             
             
}
