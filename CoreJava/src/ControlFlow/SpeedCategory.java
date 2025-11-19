package ControlFlow;

public class SpeedCategory {
              public static void main(String[] args) {
				int speed = 60;
				
				if(speed>=10 && speed<=200) {
					if(speed>10 && speed<40) {
						System.out.println("Speed is slow");
					}
					else if(speed>40 && speed<90) {
						System.out.println("Speed is normal");
					}
					else if(speed>90 && speed<130) {
						System.out.println("speed is fast");
					}
					else if(speed>130 && speed<=200) {
						System.out.println("overspeed");
					}
				}
				else {
					System.out.println("The enter speed is not valid");
				}
			}
}