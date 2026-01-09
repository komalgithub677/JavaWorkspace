package multithreading.runnable;

public class MyThread implements Runnable{

	@Override
	public void run() {
           for(int i=1; i<=100; i++) {
        	   System.out.println("run method logic");
        	   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           }
	}
	
	public void m1() {
           for(int i=1; i<=100; i++) {
        	   System.out.println("m1 method logic");
        	   
        	   try {
   				Thread.sleep(5000);
   			} catch (InterruptedException e) {
   				// TODO Auto-generated catch block
   				e.printStackTrace();
   			}
           }
	}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.m1();
		Thread t = new Thread();
		t.start();
	}

}
