package SwitchCase;

public class ShippingCharges {
             public static void main(String[] args) {
            	// 28. Shipping Charges

            	// Input parcel weight category → print charges.
            	 
            	 int weight =30;
            	 int category;
            	 
            	 //Weight Range (kg)	Category	Charge
            	// 0–5 kg	1	₹50
            	 //6–20 kg	2	₹100
            	 //21–50 kg	3	₹200
            	 //Above 50 kg	default	Extra charge
            	 
            	 if(weight<=5) {
            		 category = 1;
            	 }
            	 else if(weight<=20) {
            		 category = 2;
            	 }
            	 else if(weight<=50) {
            		 category = 3;
            	 }
            	 else {
            		 category = 4;
            	 }
            	 
            	 switch(category) {
            	 case 1:
            		 System.out.println("weight " + weight + "Kg");
            		 System.out.println("Shipping Charges : 50");
            	 break;
            	 
            	 case 2:
            		 System.out.println("weight " + weight + "Kg");
            		 System.out.println("Shipping Charges : 100");
            	 break;
            	 
            	 case 3:
            		 System.out.println("weight " + weight + "Kg");
            		 System.out.println("Shipping Charges : 150");
            	 break;
            	 
            	 default:
            		 System.out.println("weight " + weight + "Kg");
            		 System.out.println("Extra charges");
            	 }
			}
}
