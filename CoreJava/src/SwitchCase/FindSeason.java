package SwitchCase;

public class FindSeason {
        public static void main(String[] args) {
        	//20. Find Season

        	//1–4:
        	//1: Winter
        	//2: Summer
        	//3: Rainy
        	//4: Spring
			int num = 4;
			
			switch(num) {
			case 1:
				System.out.println("Season would be the winter");
			break;
			
			case 2:
				System.out.println("Season would be the Summer");
			break;
			
			case 3:
				System.out.println("Season would be the Rainy");
			break;
			
			case 4:
				System.out.println("Season would be the Spring");
			break;
			
			default:
				System.out.println("Enter number not belong to the any season");
			}
			
		}
}
