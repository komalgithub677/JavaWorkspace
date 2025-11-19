
package ControlFlow;

public class TemperatureRequireACFan {
             public static void main(String[] args) {
				double temp = 35;
				if(temp>=0 && temp<=60) {
					if(temp<=20) {
						System.out.println("temperature require heater");
					}
					else if(temp<=40) {
						System.out.println("temperature requires fan");
					}
					else if(temp<=60) {
						System.out.println("temperature requires AC");
					}
				}
			}
}