package superthis;

public class B {
        B(){
        	System.out.println("Default Constructor");
        }
        B(int a){
        	System.out.println(a);
        }
        public static void main(String[] args) {
			B b = new B();
			A a1 = new A(6);
		}
}
