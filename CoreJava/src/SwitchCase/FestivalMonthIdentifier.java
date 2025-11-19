package SwitchCase;

public class FestivalMonthIdentifier {
             public static void main(String[] args) {
            	 //30. Festival Month Identifier

            	 //Input Indian festival name → print the month (Diwali, Holi, Navratri, etc.)
            	 
            	 String festival = "Diwali";
            	 
            	 switch(festival) {
            	 case "Diwali":
            		 System.out.println("Month would be the october or november");
            	 break;
            	 
            	 case "Holi":
            		 System.out.println("Month would be the february or March");
            	 break;
            	 
            	 case "Navratri":
            		 System.out.println("Month would be the September or october");
            	 break;
            	 
            	 default:
            		 System.out.println("Not belongs to the indian festival");
            	 }
			}
}
