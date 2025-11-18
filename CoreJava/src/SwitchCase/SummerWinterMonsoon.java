package SwitchCase;

public class SummerWinterMonsoon {
             public static void main(String[] args) {
				String month = "January";
				
				switch(month) {
				case "January":
					System.out.println("Winter");
				break;
				case "February":
					System.out.println("Winter");
				break;
				case "March":
					System.out.println("Winter");
				break;
				case "April":
					System.out.println("Summer");
				break;
				case "May":
					System.out.println("Summer");
				break;
				case "June":
					System.out.println("Summer");
				break;
				case "July":
					System.out.println("Monsoon");
				break;
				case "August":
					System.out.println("Monsoon");
				break;
				case "September":
					System.out.println("Monsoon");
				break;
				case "October":
					System.out.println("Autumn");
				break;
				
				case "November":
					System.out.println("Autumn");
				break;
				case "December":
					System.out.println("Autumn");
				break;
				
				default:
					System.out.println("Enter month is not valid");
				}
			}
}
