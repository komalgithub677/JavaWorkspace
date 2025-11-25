
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
				
//				Combine three variables:
//					int a=2,b=3,c=4; int r = a++ + --b + c++ + ++a + b--;
//
//					int a=4; int b = a++ + ++a + a++ + a++;
//
//					int a=10; int b = ++a - a++ + a-- - --a;
//
//					int x=6; x = x++ + x-- + x++ + x-- + ++x;
//
//					int a = 1; int b = a++ + a++ + a++ + a;
//
//					int i = 4; int j = i-- - --i - i--;
//
//					int v=3; int w = v++ * ++v * v++;
//
//					int x=8; int y = ++x + ++x + x++ + x++;
//
//					int a=7; int b = --a + a-- + --a + a++;
//
//					int i=5; int j = (i++ + ++i) - (i-- + --i);
//
//					int a = 10; int b = a++ + a-- - ++a + --a;
//
//					int x = 3; x = ++x - x++ + --x - x--;
//
//					int m = 5; m = m++ * ++m / m-- + --m;
//
//					int i=2; int j = ++i * i++ + i-- * --i;
//
//					Nested: int a = 1; int b = (++a + a++ + --a + a--);
//
//					int x=9; int y = x-- + x++ + --x + ++x;
//
//					int k=2; k = k++ + k++ + k++ + k++ + k;
//
//					int a=4; int b = (++a) + (a++) + (--a) + (a--);
//
//					int x = 3; x = x++ * (++x) * (x--);
//
//					int a = 6; int b = a-- + a++ + ++a + --a + a;
//
//					int m=5; int n = m++ - (m-- + (++m));
//
//					int x = 0; int y = x++ + ++x + x++;
//
//					int a = -1; int b = a++ + ++a + a--;
//
//					int n=10; int m = (--n) + (n--) + (++n);
//
//					int x=7; int y = (x++) - (--x) + (++x);
//
//					int a = 4; int b = --a - a++ + a-- - ++a;
//
//					int p=3; p = ++p - p-- + ++p - p++;
//
//					int x=2; int r = ++x + x++ + --x + x--;
//
//					int a=5; int b = ++a * (a++) * (--a);
//
//					int i=1; int j = i++ + i++ + i++ + i++;
//
//					int x=10; int y = x-- * ++x / x--;
//
//					int a=7; int b = ++a + a-- + --a + a++;
//
//					int b=2; int c = b++ - ++b - b--;
//
//					int x=5; int z = (x++) + (x--) + (x++);
//
//					int m=9; int t = --m + m-- - ++m;
//
//					int i=3; int j = (i--) + (i++) + (--i) + (i++);
//
//					int x=6; x = (--x) + (++x) + (x++);
//
//					int a=4; int b = (a-- + a++) * (--a);
//
//					int i=8; int j = --i + i-- + i++;
//
//					int p=1; p = (++p) + (p++) + (--p) + (p--);
//
//					int t=6; int r = (t++) + (++t) + (t--) + (--t);
//
//					int a=3; int b = (--a) - (a--) - (++a);
//
//					int x=9; int y = x++ + x-- + ++x + --x;
//
//					int m=2; int n = ++m - m++ + m--;
//
//					int a=5; int b = a++ * ++a + a--;
//
//					int x=1; int y = (++x) + (++x) + (x++);
//
//					int a=8; a = a-- + a-- + a++ + a++;
//
//					int p=7; int q = ++p * p++ - --p;
//
//					int x=4; x = ++x + x++ + x-- + --x;
//
//					int a=2; int b = a++ + ++a + a-- + --a + a++ + a;
				
			}
}