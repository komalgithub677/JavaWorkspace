package SwitchCase;

public class TrainTicketClass {
             public static void main(String[] args) {
            	 //17. Train Ticket Class

            	 //1: General
            	 //2: Sleeper
            	 //3: AC
            	 
				String trainClass = "AC";
				
				switch(trainClass) {
				case "AC":
					System.out.println("Train class would be the AC");
				break;
				
				case "Sleeper":
					System.out.println("Trian class would be the sleeper");
				break;
				
				case "General":
					System.out.println("Train class would be the General");
				break;
				
				default:
					System.out.println("Class entered would not be valid");
					
				}
				
				
			}
}
