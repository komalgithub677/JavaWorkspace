package practice;

public class ThreadExample extends Thread {
             public void run() {
            	 for(int i=1; i<=10; i++) {
            		 System.out.println("I : "+ i)  ;
            	 }
            	 
            	 try {
					sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             }
             public static void main(String[] args) {
				ThreadExample t = new ThreadExample();
				t.start();
				
				for(int i=1; i<=10; i++) {
					System.out.println("2's table : " + (2*i));
				}
			}
}


