
package SwitchCase;

public class FoodMenu {
             public static void main(String[] args) {
            	 //8. Food Menu

            	 //Show menu (pizza, burger, pasta) → print price.
            	 String FoodMenu = "burger";
            	 
            	 switch(FoodMenu) {
            	 case "burger":
            		 System.out.println("Price of burger would be 100");
            	 break;
            	 case "pizza":
            		 System.out.println("Price of the pizza would be 200");
            	 break;
            	 case "pasta":
            		 System.out.println("Price of the pasta would be 150");
            	break;
            	default:
            		System.out.println("No menu available");
            	 }
			}
}