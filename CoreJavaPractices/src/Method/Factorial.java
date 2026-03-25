package Method;

public class Factorial {
//	//nonparameterised
//	int  factorial() {
// 	   int num =2;
// 	   int fact =1;
// 	   for(int i=1; i<=num; i++) {
// 		   fact = fact*i;
// 		  
// 	   }
// 	  return fact;
//    }
	
	int factorial( int num) {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	String myName(String fName , String lName) {
		return fName + "" + lName;
	}
	void myInfo(String name ,int myAge , String city ,long mobNo ,String myEmail , char gender) {
		System.out.println("My name is : " + name);
		System.out.println("My age is :" + myAge);
		System.out.println("My City is :" + city);
		System.out.println("My mobie No is :" + mobNo);
		System.out.println("My emai is " + myEmail);
		System.out.println("My gender is : " + gender);
	}
}
