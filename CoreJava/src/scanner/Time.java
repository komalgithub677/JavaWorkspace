package scanner;

import java.util.Scanner;

public class Time {
             public void time(int totalSeconds) {
            	 int minutes = totalSeconds /60;
            	 int seconds = totalSeconds %60;
            	 
            	 System.out.println("Minutes : " + minutes);
            	 System.out.println("Seconds : " + seconds);
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the time in seconds : ");
				int totalSeconds = sc.nextInt();
				
				Time t = new Time();
				t.time(totalSeconds);
				
				
			}
}
