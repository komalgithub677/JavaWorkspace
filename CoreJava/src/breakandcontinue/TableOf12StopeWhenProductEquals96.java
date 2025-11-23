package breakandcontinue;

public class TableOf12StopeWhenProductEquals96 {
             public static void main(String[] args) {
				//Print table of 12 but stop when product becomes exactly 96.
            	 for(int i=1; i<=10; i++) {
            		 int product = 12*i;
            		 if(product == 96) {
            			 break;
            		 }
            		 System.out.println(product);
            	 }
			}
}
