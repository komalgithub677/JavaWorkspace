package Method;

public class Employee {
		//returnType methodName(){}
	 //Non-parameterised without return type
	void m2() {
		System.out.println("Hello world");
	}
	
	//Parameterised method without return type
	void m1(String fName , String Lname) {
		System.out.println("Hello world");
		System.out.println(fName + " " + Lname);
	}
	
	
	void myAddition(int a , int b) {
//		int a =23;
//		int b =2;
		
		System.out.println("Sum is = " + (a+b));
	}
	
	void mySquare() {
		int num = 12;
		System.out.println("Sauare of  "+ num + "= " + (num*num));
	}
	
	void evenOdd(int num) {
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
