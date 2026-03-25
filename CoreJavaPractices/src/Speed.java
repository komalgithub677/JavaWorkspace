
public class Speed {
//	Create a class Car where speed cannot exceed 120 km/h using setter validation.
//
	private int speed;
	
	public void setSpeed(int speed) {
		if(speed>=120) {
			System.out.println("speed set successfully");
		}
		else {
			System.out.println("Speed should be greater than 120");
		}
	}
	
	public static void main(String[] args) {
		Speed s = new Speed();
		s.setSpeed(24);
		s.setSpeed(45);
		s.setSpeed(789);
	}
}
