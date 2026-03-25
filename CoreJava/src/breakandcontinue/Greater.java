package breakandcontinue;

public class Greater {
             public static void main(String[] args) {
				//Print sum of numbers from 1–100 but break if sum crosses 300.
            	 int sum =0;
            	 for(int i=1; i<=100; i++) {
            		 sum +=i;
            		 if(sum>300) {
            			 break;
            		 }
            		 System.out.println(sum);
            	 }
			}
}
