package ControlFlow;

public class OperatorPractice1 {
             public static void main(String[] args) {
				int a =5,
				b = a++ + ++a;
				System.out.println(b);
//				int x = 10; int y = ++x + x++ + x;
				int x =10; 
				int y = ++x + x++ + x;
				System.out.println(y);
//
//				int i = 5; int j = i-- - --i + ++i + i++;
				int i =5 ;
				int j = i-- - --i + ++i + i++;
				System.out.println(i);
//
//				int p = 3; int q = p++ * ++p + p--;
				int p =3 ;
				int q = p++ * ++p + p--;
				System.out.println(q);
//
//				int a = 5; a = a++ + ++a + a-- + --a;
				int a1 =5;
				a1 = a1++ + ++a1+ a1-- + --a1;
				System.out.println(a1);
//
//				int x = 7; int y = x++ + x++ + ++x;
				int x1 = 7;
				int y1=x1++ + x1++ + ++x1;
				System.out.println(y1);
//
//				int a = 1; int b = ++a + ++a + a++ + a;
				int a2 = 1 ;
				int b2 = ++a2 + ++a2 + a2++ + a2;
				System.out.println(b2);
//
//				int x = 2; x = ++x + x++ + ++x + x--;
				int x2 =2; 
				x2 = ++x2 + x2++ + x2--;
				System.out.println(x2);
//
//				int a = 10; int b = --a + a-- + ++a + a++;
				int a3=10;
				int b3 =--a3 + a3-- + ++a3 + a3++;
				System.out.println(b3);
				System.out.println(a3);
//
//				int n = 5; int m = n++ - --n + ++n - n--;
				int n=5 ;
				int m = n++ - --n + ++n - n--;
				System.out.println(m);
				System.out.println(n);
				
			}
}
