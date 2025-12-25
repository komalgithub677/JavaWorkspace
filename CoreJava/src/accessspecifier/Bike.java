package accessspecifier;

public abstract class Bike implements Vehicle {
            
			@Override
			public void run(double speed) {
				System.out.println(speed);
			}

			@Override
			public void start(double speed) {
				System.out.println(speed);
				
			}
			
			  public static void main(String[] args) {
					Vehicle v;
//					v= new Bike();
//					v.run(12.30);
//					v.run(23.30);
					
				}
}
