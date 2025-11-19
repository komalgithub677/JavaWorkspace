package SwitchCase;

public class MovieTicketBooking {
       public static void main(String[] args) {
    	   //16. Movie Ticket Booking

    	  // Select:

    	  // Balcony

          // Gold

    	  //Platinum
    	  //Print ticket price.
    	   
    	   String select = "Balcony";
    	   
    	   switch(select) {
    	   case "Balcony":
    		   System.out.println("Ticket price would be the 150");
    	   break;
    	   
    	   case "Gold":
    		   System.out.println("Ticket price would be the 220");
    		break;
    		
    	   case "Platinum":
    		   System.out.println("Ticket price would be the 300");
    	   break;
    	   
    	   default:
    		   System.out.println("Enter seat is not valid");
    	   }
	}
}
