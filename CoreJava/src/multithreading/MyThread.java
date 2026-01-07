package multithreading;

public class MyThread extends Thread {
             public void run() {
            	 for(int i=1; i<=10; i++) {
            		 System.out.println("My thread : " + i);
            	 }
            	try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             }
             
             public void m1() {
            	 for(int i=11; i<=110; i++) {
            		 System.out.println("This method of thread class:" + i);
            	 }
            	 System.out.println(4/0);
//            	 try {
//					sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
             }
             
             public void m1(int a) {
            	 for(int i=11; i<=20; i++) {
            		 System.out.println("This method of thread class:" + i);
            	 }
            	 try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
             }
}


