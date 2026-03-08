
public class NQTQuestionsPractice {
             public void checkEvenOdd() {
            	 int n =12;
            	 if(n%2==0) {
            		 System.out.println("Even");
            	 }
            	 else {
            		 System.out.println("Odd");
            	 }
             }
             
             public void primeNumber() {
            	 int num =12;
            	 boolean isPrime = false;
            	 
            	 if(num==1) {
            		 System.out.println("Not prime");
            	 }
            	 
            	 for(int i=2; i<Math.sqrt(num); i++) {
            		 if(num%i==0) {
            			 isPrime = false;
            			 break;
            		 }
            	 }
            	 if(isPrime==true) {
            		 System.out.println("Number is prime");
            	 }
            	 else {
            		 System.out.println("Number is not prime");
            	 }
            	 
             }
             
             public void factorial() {
            	 int num =12;
            	 int fact = 1;
            	 for(int i=1; i<=num; i++) {
            		 fact *=i;
            	 }
            	 
            	 System.out.println(fact);
             }
             public static void main(String[] args) {
            	 NQTQuestionsPractice  n = new NQTQuestionsPractice ();
            	 n.checkEvenOdd();
            	 n.primeNumber();
            	 n.factorial();
			}
}
