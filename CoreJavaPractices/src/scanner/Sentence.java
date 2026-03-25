package scanner;

import java.util.Scanner;

public class Sentence {
             public void sentence(String s) {
            	 System.out.println(s);
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the your sentence ");
				String s = sc.nextLine();
				
				Sentence st = new Sentence();
				st.sentence(s);
				
				
			}
}
