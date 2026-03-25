package SwitchCase;

public class TrafficLightMeaning {
       public static void main(String[] args) {
		String color ="Red";
		
		switch(color) {
		case "Red":
			System.out.println("STOP");
			break;
		case "Yellow":
			System.out.println("SLOW");
			break;
		case "Green":
			System.out.println("Get Ready");
			break;
		default:
			System.out.println("Invalid Signal...!");
		}
	}
}
