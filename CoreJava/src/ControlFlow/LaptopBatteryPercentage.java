
package ControlFlow;

public class LaptopBatteryPercentage {
             public static void main(String[] args) {
				int batteryPercentage=90;
				if(batteryPercentage<10) {
					System.out.println("Battery percentage falls under the critical");
				}
				else {
					System.out.println("Battery percentage does not falls under the critical");
				}
			}
}