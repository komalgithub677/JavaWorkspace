
package SwitchCase;

public class HotelRoomType {
             public static void main(String[] args) {
            	// 27. Hotel Room Type

            	 //1: Standard
            	 //2: Deluxe
            	 //3: Suite
            	 
            	 int roomType =1;
            	 
            	 switch(roomType) {
            	 case 1:
            		 System.out.println("Room type would be the standard");
            	 break;
            	 
            	 case 2:
            		 System.out.println("Room type would be the deluxe");
            	 break;
            	 
            	 case 3:
            		 System.out.println("Room type would be the suite");
            	 break;
            	 
            	 default:
            		 System.out.println("Selected room is not available");
            	 }
			}
}