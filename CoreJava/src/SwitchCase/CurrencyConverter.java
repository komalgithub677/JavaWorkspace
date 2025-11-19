package SwitchCase;

public class CurrencyConverter {
             public static void main(String[] args) {
            	 double amount = 100;
				String currency = "USD";
				
				switch(currency) {
				case "INR":
					System.out.println(amount +"alredy in INR");
				break;
				case "USD":
						System.out.println(amount*83.0);
				break;
				case "EUR":
					System.out.println(amount*90);
				break;
				default:
					System.out.println("Invalid currency");
				}
			}
}
