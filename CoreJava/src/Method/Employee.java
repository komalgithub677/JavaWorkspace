package Method;

public class Employee {
            
	//returnType methodName(){}
	 //Non-parameterised without return type
	void m2() {
		System.out.println("Hello world");
	}
	//Parameterised method with return type
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
	
	
}
