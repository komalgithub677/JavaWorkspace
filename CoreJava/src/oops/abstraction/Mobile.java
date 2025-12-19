package oops.abstraction;

public class Mobile {
             public void clickPhoto() {
            	 System.out.println("Click the photo...");
             }
             
             public void playMusic() {
            	 System.out.println("Play the music...");
             }
             
             public static void main(String[] args) {
				Mobile m = new Mobile();
				m.clickPhoto();
				m.playMusic();
			}
}
