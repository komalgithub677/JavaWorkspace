package superthis;

public class A {
             A(int a){
            	 System.out.println(a);
             }
//             static A(String s) {
//            	 System.out.println(s);
//             }
             public static void main(String[] args) {
				A a = new A(5);
			}
}
