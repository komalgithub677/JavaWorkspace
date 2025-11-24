package loops;

public class loopsPractice {
              public static void main(String[] args) {
				for(int i=1; i<=10; i++) {
				System.out.println("Hello");
			}
              
             //2.Multiplication table of any number
              int n = 7;
              for(int i = 1; i <= 10; i++){
                  System.out.println(n + " × " + i + " = " + (n*i));
              }
              
              //sum of digits using numbers
              int num = 572;
              int sum = 0;

              while(num > 0){
                  int digit = num % 10;
                  sum += digit;
                  num /= 10;
              }

              System.out.println("Sum = " + sum);

              //4. Print all even numbers between 1 to 200 using for loop
              for(int i = 1; i <= 200; i++){
            	    if(i % 2 == 0){
            	        System.out.println(i);
            	    }
            	}

              //5. Print the reverse of a number (e.g., 1234 → 4321) using while loop
              int num1 = 1234;
              int rev = 0;

              while(num > 0){
                  int digit = num1 % 10;
                  rev = rev*10 + digit;
                  num1 /= 10;
              }

              System.out.println("Reverse = " + rev);

             

}
}

