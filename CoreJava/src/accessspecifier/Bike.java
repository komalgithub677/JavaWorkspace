package accessspecifier;

public class Bike implements Vehicle {
             public void run() {
            	 System.out.println("This is the run Method Of the Bike class");
             }
             
             public static void main(String[] args) {
				Vehicle v;
				v= new Bike();
				v.run();
				
			}
}
