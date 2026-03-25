
package SwitchCase;

public class ElectricityRate {
             public static void main(String[] args) {
             //8. Accept a category type (Domestic, Commercial, Industrial) and print the electricity rate per unit using a switch case.
            	 String category = "Domestic";
            	 
            	 switch(category) {
            	 case "Domestic":
            		 System.out.println("Electricity rate for domestic 5rupees per unit");
            	 break;
            	 case "Commercial":
            		 System.out.println("Electricity rate for Commercial 8 rupees per unit");
            	break;
            	 case "Industrial":
            		 System.out.println("Electricity rate for Industrial would be 12 rupees per unit");
            	break;
            	default:
            		System.out.println("Enter the valid case");
            	 }
			}
}