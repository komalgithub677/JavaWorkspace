package ControlFlow;

public class OperatorOutputTest {
             public static void main(String[] args) {
           	  int a = 10, b =4 , c =8;
           	  a += 5; 
           	  a -= 3; 
           	  a *= 2; a /= 4; 
           	  System.out.println(a);
            	
           	 int a1 = 5, b1 = 10, c1 = 15;
           	 System.out.println((a1 < b1) && (b1 < c1));
           	 
             System.out.println((a > b) || (b < c)); 
             System.out.println(!(a < c));
             
	         int x = 10, y = 20; System.out.println(x++ + ++y);
          	 System.out.println(a % b);
          	 
             int p = 7, q = 3; System.out.println(p * q + p / q);
             
             int n = 5; System.out.println(++n + n++);
             
//            	 8. int x = 5, y = 10; System.out.println(x > y ? x : y);
              int a2 = 10, b2 = 5, c2; c2 = a2++ + --b2 + a2 * b2; System.out.println(c2);
              
         	  int a3 = 4, b3 = 2; 
         	  System.out.println(a3 << b3);
              
              int a4 = 8, b4 = 2; System.out.println(a4 >> b4);
              int a5 = 10; System.out.println(~a5);
              int a6 = 5, b6 = 7; System.out.println(a6 & b6);
              int a7 = 5, b7 = 7; System.out.println(a7 | b7);
              int a8 = 5, b8 = 7; System.out.println(a8 ^ b8);
              int a9 = 10; System.out.println(a9++ + ++a9 + a9--);
              int a10 = 1; a10 += a10++ + ++a10; System.out.println(a10);
//            int a = 5, b = 10; boolean result = (a < b) ? true : false; System.out.println(result);
              System.out.println(a == b);
           	  System.out.println(a * b + a / b);
              a = a++ + ++a; System.out.println(a);
              System.out.println(a > b && a != b);
              int x1 = 2, y1 = 3; x1 *= y1 + 1; System.out.println(x1);
              a += a -= a *= a; System.out.println(a);
//              System.out.println(a > b ? a++ : ++b);
              System.out.println(a++ + a++ + ++a);
              System.out.println(a + b * a / b);
              System.out.println(a < b && b > a);
              System.out.println((a / b) * (a % b));
              System.out.println((a < b && b > c) || !(b < c));
			}
}
