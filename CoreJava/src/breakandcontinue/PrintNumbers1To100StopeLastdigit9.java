package breakandcontinue;

public class PrintNumbers1To100StopeLastdigit9 {
             public static void main(String[] args) {
				//Print numbers from 1 to 100 but stop when last digit becomes 9.
            	 for(int i=1; i<=100; i++) {
            		 int lastDigit = i%10;
            		 if(lastDigit==9) {
            			 break;
            		 }
            		 System.out.println(i);
            	 }
			}
}
