package SwitchCase;

public class Calculator {
        public static void main(String[] args) {
			char operation = '+';
			
			switch(operation) {
			case '+':
				int a =3 ,b=4;
				System.out.println("Addition of two number is:" +(a+b));
				break;
			case '-':
			    int a1 =6, a2=9;
				System.out.println("Substraction of two number is"+(a1-a2));
				break;
			case '*':
			   int x=2, y=3;
			   System.out.println("Multiplication of two number is:" +(x*y));
			   break;
			case '/':
				int x1 =5, x2=9;
				System.out.println("Divid of two number is :"+ (x1/x2));
				break;
			case '%':
				int y1=10 , y2=2;
				System.out.println("Remainder of two number is :" +(y1%y2));
				break;
			default:
				System.out.println("Invalid operation");
			}
			
		}
}
