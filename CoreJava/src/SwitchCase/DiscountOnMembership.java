package SwitchCase;

public class DiscountOnMembership {
             public static void main(String[] args) {
            	 //24. Discount Based on Membership

            	 //Silver / Gold / Platinum → print discount.
            	 String membership = "Silver";
            	 
            	 switch(membership) {
            	 case "Silver":
            		 System.out.println("Discount would be the 50%");
            	 break;
            	 
            	 case "Gold":
            		 System.out.println("Discount would be the 70%");
            	 break;
            	 
            	 case "Platinum":
            		 System.out.println("Discount would be the 40%");
            	 break;
            	 
            	 default:
            		 System.out.println("Membership is not valid");
            	
            	 }
			}
}
