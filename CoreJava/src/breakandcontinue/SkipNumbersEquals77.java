package breakandcontinue;

public class SkipNumbersEquals77 {
             public static void main(String[] args) {
				//Print numbers from 1 to 100 but stop when the number reaches 77. (Use break)
            	 for(int i=1; i<=100; i++) {
            		 if(i==77) {
            			 continue;
            		 }
            		 System.out.println(i);
            	 }
			}
}
