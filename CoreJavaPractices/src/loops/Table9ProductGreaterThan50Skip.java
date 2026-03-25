package loops;

public class Table9ProductGreaterThan50Skip {
             public static void main(String[] args) {
//				for(int i=1; i<=10; i++) {
//					int product = 9 * i;
//					if(product>50) {
//						break;
//					}
//					System.out.println(product);
//				}
            	 
            	 for(int i=1; i<=10; i++) {
            		 if(i==5) {
            			 continue;
            		 }
            		 System.out.println(i);
            	 }
				
			}
}
