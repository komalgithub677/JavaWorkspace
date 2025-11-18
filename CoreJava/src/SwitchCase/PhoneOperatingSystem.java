package SwitchCase;

public class PhoneOperatingSystem {
             public static void main(String[] args) {
            	 //21. Phone Operating System

            	 //Print info for Android, iOS, Windows.
            	 
            	 String os ="Android";
            	 os = os.toLowerCase();
            	 
            	 switch(os) {
            	 case "android":
            		 System.out.println("Android os : Developed by the google , open source , most of smartphone use this  ");
            	 break;
            	 
            	 case "ios":
            		 System.out.println("Ios os : Developed by the apple ,known for security ,smooth UI , available only on iphones");
            	 break;
            	 
            	 case "windows":
            		 System.out.println("Windows os : Developed by the microsoft , discontinued but known for the tile UI");
            	 break;
            	 
            	 default:
            		 System.out.println("unknown and the unsupported os");
            	 }
			}
}
