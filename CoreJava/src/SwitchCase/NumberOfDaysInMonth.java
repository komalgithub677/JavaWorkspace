package SwitchCase;

public class NumberOfDaysInMonth {
             public static void main(String[] args) {
				int month = 2;
				
				switch(month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("Number of days in the month would be the 31");
				break;
				
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("Number of days in the month would be the 30");
				break;
				
				case 2:
					System.out.println("Number of days in the month would be the 28 or 29");
				break;
				default:
					System.out.println("Enter month would be invalid");
				}
			}
}
