
public class BitwiseOrOperatorDay8 {
       public static void main(String[] args) {
//		int a =5;
//		int b =3;
//		int c = a | b;
		int a =10 , b=20;
		System.out.println(a>5 || b<15);
		
		int x =5;
		System.out.println(x>10 || x<8);
		
//		System.out.println(c);
//		int a1=10 , b1=0;
//		System.out.println(b1 !=0 || (a1/b1>1));
		
		int a1 =-5 , b1=3;
		System.out.println(a1 | b1);
		
		int a2 =0x0F0F , b2 =0x3333;
		System.out.println(Integer.toHexString(a2|b2));
		
		int x1 =15;
		System.out.println(Integer.toBinaryString( x1| (x1>>2)));
		
		int x2 = 8;
		System.out.println((x2 | (x2-1)));
		
		System.out.println(Integer.toBinaryString((5|3)|(7|2)));
	}
}
