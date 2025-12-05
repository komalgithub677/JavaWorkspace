package oops.contructor;

public class MethodPractice {
	

//6. Write a method printMessage() (no parameter, no return) that prints "Welcome to Java".
    public void printMessage() {
    	System.out.println("Welcome to java");
    }
	
//7. Write a method add(int a, int b) (parameterized, no return) that prints the sum.
    public void add(int a ,int b) {
    	int sum = a + b;
    	System.out.println("Sum would be :" + sum);
    }
//8. Write a method multiply(int a, int b) (parameterized, returns result).
    
//Call it from main and print the answer.**
    public int multiply(int a ,int b) {
    	int result = a * b;
    	return result;
    }
//
    
//9. Write a method getName() (no parameter, returns a String) that returns your name.
    String name = "Komal ";
    public String getName() {
    	return name;
    }    
//10. Write a method isEven(int n) (parameterized return type boolean) that checks even/odd.
    public boolean isEven(int n) {
    	if(n%2==0) {
    		System.out.println("Number is even");
    		return true;
    	}
    	else {
    		System.out.println("Number is not even");
    		return false;
    	}
    	
    }
    
}
