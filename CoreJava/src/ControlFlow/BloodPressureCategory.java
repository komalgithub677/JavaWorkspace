package ControlFlow;

public class BloodPressureCategory {
            public static void main(String[] args) {
				int systolic = 190;
				if(systolic>=0) {
					if(systolic<90) {
						System.out.println("Low blood pressure Hypotension");
					}
					else if(systolic>=90 && systolic<=119) {
						System.out.println("Normal Blood pressure");
					}
					else if(systolic>=120 && systolic<=129) {
						System.out.println("Elevated(Pre-Hypertension");
					}
					else if(systolic>=130 && systolic<=139) {
						System.out.println("Hypertension stage 1");
					}
					else if(systolic>=140 && systolic<=179) {
						System.out.println("Hypertension stage 2");
					}
					else if(systolic>=180) {
	                    System.out.println("Hypertensive Crisi (Very Dangerous");
					}
				}
				else {
					System.out.println("Does not have a blood pressure");
				}
			}
}
