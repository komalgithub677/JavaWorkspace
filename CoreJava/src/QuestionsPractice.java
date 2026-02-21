import java.util.Scanner;


public class QuestionsPractice {
	         public void fact(int n) {
	        	 int fact =1;
	        	 for(int i=1; i<=n; i++) {
	        		 fact *=i;
	        	 }
	        	 System.out.println("Factorial : " + fact);
	         }
             
             
             public static void main(String[] args) {
				QuestionsPractice q = new QuestionsPractice();
				Scanner sc =new Scanner(System.in);
				int n =sc.nextInt();
				if(n%2==0) {
					System.out.println("Even");
				}
				else {
					System.out.println("Odd");
				}
				
				//Check prime number
				boolean isPrime = true;
				
				if(n<=1) {
					isPrime =false;
				}
				
				for(int i=2; i<=Math.sqrt(n); i++) {
					if(n%i==0) {
						isPrime =false;
						break;
					}
				}
				if(isPrime =true) {
					System.out.println("Prime number");
				}
				else {
					System.out.println("Not prime number");
				}	
				
				//factorial
				q.fact(n);
}
}