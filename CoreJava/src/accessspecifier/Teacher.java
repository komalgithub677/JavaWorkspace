package accessspecifier;

public class Teacher {
	
	Teacher(){
		super();
	}
             public static void main(String[] args) {
				Student s = new Student();
				s.my();
				int a = s.a;
				int b = s.b;
				int c = s.b;
				System.out.println("a :" + a);
				System.out.println("b :" + b);
				System.out.println("c :" +b);
			}
}
