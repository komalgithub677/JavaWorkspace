package accessspecifier;

public class B {
       public static void main(String[] args) {
		A a = new A();
		int x = a.x = 10;
		System.out.println("X : " + x);
	}
}
