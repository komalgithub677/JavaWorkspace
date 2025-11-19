package SwitchCase;

public class BankAtmMenu {
             public static void main(String[] args) {
            	 //18. Bank ATM Menu

            	 //Deposit

            	 //Withdraw

            	 //Check Balance
				String bankMenu = "Check Balance";
				
				switch(bankMenu) {
				case "Deposit":
					System.out.println("You have to deposit the money in the ATM");
				break;
				
				case "Withdraw":
					System.out.println("You have witdraw the money from the ATM");
				break;
				
				case "Check Balance":
					System.out.println("You have to check the balace in your account");
				break;
				
				default:
					System.out.println("Enter menu is not vlaid");
				}
			}
}
