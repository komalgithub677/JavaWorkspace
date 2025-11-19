
package ControlFlow;

public class CricketMatchTieWinOrLoss {
             public static void main(String[] args) {
				int team1Runs = 100;
				int team2Runs = 100;
				
				if(team1Runs==team2Runs) {
					System.out.println("Tie between the team1 and the team2");
				}
				else if(team1Runs>team2Runs) {
					System.out.println("Team one wins");
				}
				else {
					System.out.println("Team 2 wins");
				}
			}
}