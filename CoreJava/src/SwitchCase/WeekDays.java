package SwitchCase;

public class WeekDays {
       public static void main(String[] args) {
		int day =5;
		
		switch(day) {
		case 1 :
			System.out.println("Day is monday");
			break;
		case 2 :
			System.out.println("Day is Tuesday");
			break;
		case 3 :
			System.out.println("Day is wednesday");
			break;
		case 4:
			System.out.println("Day is thursday");
			break;
		case 5:
			System.out.println("Day is friday");
			break;
		case 6:
			System.out.println("Day is saturday");
			break;
		case 7:
			System.out.println("Day is sunday");
			break;
		default:
			System.out.println("Enter case is not valid");
		}
	}
}
