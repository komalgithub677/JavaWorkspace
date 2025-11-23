package breakandcontinue;

public class TableOf5stopMultipleAt15 {
             public static void main(String[] args) {
				//Print multiples of 5 but stop when number is divisible by 15.
            	 for(int i=1; i<=10; i++) {
            		 int product = i*5;
            		 if(product%15==0) {
            			 break;
            		 }
            		 System.out.println(product);
            	 }
			}
}
