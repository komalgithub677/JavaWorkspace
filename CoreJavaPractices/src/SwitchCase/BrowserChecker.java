
package SwitchCase;

public class BrowserChecker {
       public static void main(String[] args) {
    	   //9. Browser Checker

    	   //Print details for Chrome, Firefox, Edge, Safari.
    	   String browser = "Firefox";
    	   
    	   switch(browser) {
    	   case "Edge":
    		   System.out.println("Browser would be the edge browser");
    	   break;
    	   case "Chrome":
    		   System.out.println("Browser would be the chrome browser");
    	   break;
    	   case "Firefox":
    		   System.out.println("Browser would be the firefox");
    	   break;
    	   case "Safari":
    		   System.out.println("Browser would be the safari");
    	   break;
    	   default:
    		   System.out.println("Browser is not available");
    	   }
	}
}