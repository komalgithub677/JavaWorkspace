package ControlFlow;

public class SugarLevel {
             public static void main(String[] args) {
				int sugarLevel = 50;
				if(sugarLevel<70) {
					System.out.println("Sugar level is low");
				}
				else if(sugarLevel>=70 && sugarLevel<=99) {
					System.out.println("Sugar level is Normal");
				}
				else if(sugarLevel>=100 && sugarLevel<=125) {
					System.out.println("Sugar level is Prediabetes");
				}
				else if(sugarLevel>=126) {
					System.out.println("sugar level is on diabetes");
				}
		}
}
