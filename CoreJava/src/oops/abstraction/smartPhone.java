package oops.abstraction;

public class smartPhone  implements Cameras , musicPlayers{
             public void click() {
            	 System.out.println("Clcik the Photos...");
             }
             
             public void playMusic() {
            	 System.out.println("Play the music....");
             }
             
             public static void main(String[] args) {
				smartPhone s = new smartPhone();
				s.playMusic();
				s.click();
			}
}
