package multithreading;

public class AllThreadMethodsDemo extends Thread {

    // run()
    @Override
    public void run() {
        try {
            System.out.println("Thread Name        : " + getName());
            System.out.println("Thread Priority    : " + getPriority());
            System.out.println("Is Daemon          : " + isDaemon());
            System.out.println("Is Alive           : " + isAlive());
            System.out.println("Thread State       : " + getState());

            // sleep()
            System.out.println("Thread sleeping...");
            Thread.sleep(1000);

            // yield() 
            Thread.yield();

            System.out.println("Thread resumed after sleep");

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {

        // currentThread() 
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread Name   : " + mainThread.getName());

        //  create thread 
        AllThreadMethodsDemo t = new AllThreadMethodsDemo();

        //  setName() 
        t.setName("MyThread");

        //  setPriority() 
        t.setPriority(Thread.MAX_PRIORITY);

        //  setDaemon() 
        t.setDaemon(false); // must be before start()

        //  isAlive() before start 
        System.out.println("Before start alive : " + t.isAlive());

        //  start() 
        t.start();

        // isAlive() after start 
        System.out.println("After start alive  : " + t.isAlive());

        //  join() 
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // interrupt() 
        t.interrupt();

        //  isInterrupted() 
        System.out.println("Is Interrupted     : " + t.isInterrupted());

        //  getState() 
        System.out.println("Final State        : " + t.getState());

        System.out.println("Main thread ends");
    }
}
