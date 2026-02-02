
public class JavasOperatorPractice {
//	1. Arithmetic Operators (+ - * / %)
//
//	What will be the output of the following code?
//
    public void arithmeticOperator() {
    	int a = 10, b = 3;
    	System.out.println(a / b);
    }    	
    	

//
//
//	Write a Java program to find the remainder when one number is divided by another.
    public void remainder() {
    	int a =20 , c =30;
    	System.out.println("Remainder would be : " + (a%c));
    }
//
//	Predict the output:
//
	public void prePostIncrement() {
		int x = 5;
		System.out.println(x++ + ++x);
	}
//
//	🔹 2. Relational (Comparison) Operators (== != > < >= <=)
//
//	What is the output?
//
    public void relationalOperator() {
    	int a =2 , b=3;
    	System.out.println(a>b);
    	System.out.println(a<b);
    	System.out.println(a>=b);
    	System.out.println(a<=b);
    	System.out.println(a!=b);
    	System.out.println(a==b);
    }
//
//
//	Write a program to check whether a number is greater than or equal to 50.
    public void numberGreaterThan50() {
    	int a =40;
    	System.out.println(a>50);
    }
//
//	What will be printed?
//
   public void predictOutput() {
		System.out.println(10 != 10);
   }
//
//	🔹 3. Logical Operators (&& || !)
//
//	What is the output?
//
public void logicalOperator() {
	System.out.println(true && false || true);
}
//
//
//	Write a Java program to check if a number lies between 1 and 100 using logical operators.
//
public void rangeCheck() {
	int a = 60;
	System.out.println(a>=1 && a<=100);
}
//	Predict the output:
//
public void predict() {
	boolean x = false;
	System.out.println(!x);
}
//
//	🔹 4. Assignment Operators (= += -= *= /= %=)
//
//	What will be the value of a?
//
public void outputCheck() {
	int a = 10;
	a += 5;
	System.out.println(a);
}
//
//
//	Write a program that uses *= operator to multiply a variable by 10.
public void multiply() {
	int a = 10;
	a *=10;
	System.out.println(a);
}
//
//	Predict the output:
//
public void predictValue() {
	int x = 20;
	x %= 6;
	System.out.println(x);
}
//
//	🔹 5. Unary Operators (++ -- + - !)
//
//	What is the output?
//
public void unaryOperator() {
	int a = 5;
	System.out.println(++a);
}
//
//
//	What is the difference between pre-increment and post-increment?
//	Explain with an example.
// preincrement - firstly incerment that value and used that value
// post-increment - first used that value then increment that value
//
//	Predict the output:
//
public void predictO() {
	int x = 10;
	System.out.println(x--);//10
	System.out.println(x);//9
}
//
//	🔹 6. Bitwise Operators (& | ^ ~ << >> >>>)
//
//	What is the output?
//
public void bitwiseOperator() {
	System.out.println(5 & 3);
}
//
//
//	Explain the difference between >> and >>> operators.
//
//	What will be the result of:
//
public void rightShift() {
	System.out.println(5 << 1);
}
//
//	🔹 7. Ternary Operator (?:)
//
//	Write a Java program using the ternary operator to find the maximum of two numbers.
public void maxOfTwo() {
	int a =1 , b=3;
	int max = (a>b) ? a : b;
	System.out.println(max);
}
//    
    public static void main(String[] args) {
    	JavasOperatorPractice p = new JavasOperatorPractice();
    	p.arithmeticOperator();
    	p.remainder();
    	p.prePostIncrement();
    	p.relationalOperator();
    	p.numberGreaterThan50();
    	p.predictOutput();
    	p.logicalOperator();
    	p.rangeCheck();
    	p.predict();
    	p.outputCheck();
    	p.multiply();
    	p.predictValue();
    	p.unaryOperator();
    	p.predictO();
    	p.bitwiseOperator();
    	p.rightShift();
    	p.maxOfTwo();
	}
}
