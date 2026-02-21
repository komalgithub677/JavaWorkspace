package superthis;

public class C {
            C(){
            	super();
            	System.out.println("constructor");
            }
            
            public static void main(String[] args) {
				C a = new C();
			}
}
