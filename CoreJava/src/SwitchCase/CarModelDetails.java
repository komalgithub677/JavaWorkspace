
package SwitchCase;

public class CarModelDetails {
             public static void main(String[] args) {
            	 //23. Car Model Details

            	 //Input car brand → print model and price.
            	 String carModel = "Toyota";
            	 
            	 switch(carModel) {
            	 case "Toyota":
            		 System.out.println("Brand :" + (carModel));
            		 System.out.println("Popular model : fortuner");
            		 System.out.println("Price : 32,00,000");
            	 break;
            	 
            	 case "Hyundai":
            		 System.out.println("Brand : Hyundai");
            		 System.out.println("Popular model : Creta");
            		 System.out.println("Price would be the : 20,00,000");
            	 break;
            	 
            	 case "Tata":
            		 System.out.println("Brand : Tata");
            		 System.out.println("Popular model : Harrier");
            		 System.out.println("Price would be the : 18,00,000");
            	 break;
            	 
            	 case "Mahindra":
            		 System.out.println("Brand : Mahindra");
            		 System.out.println("Popular model : XUV700");
            		 System.out.println("Price would be the 20,00,000");
            	break;
            	
            	default:
            		System.out.println("Not belong to the any model");
           
            	 }
			}
}