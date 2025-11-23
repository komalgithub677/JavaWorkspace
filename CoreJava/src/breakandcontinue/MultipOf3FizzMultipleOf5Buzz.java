package breakandcontinue;

public class MultipOf3FizzMultipleOf5Buzz {
             public static void main(String[] args) {
				//Print numbers 1–100, replacing multiples of 3 by “Fizz”, multiples of 5 by “Buzz”.
            	 for(int i=1; i<=100; i++) {
            		 if(i%3==0) {
            			 System.out.println("Fizz");
            		 }
            		 if(i%5==0) {
            			 System.out.println("Buzz");
            		 }
            		 System.out.println(i);
            	 }
			}
}
