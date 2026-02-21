package statickeyword;

public class Pq2 {
        int x =10;
        
        public static void main(String[] args) {
			Pq2 p2 = new Pq2();
			System.out.println(p2.x);
		}
        
        static {
        	int x =20;
        	System.out.println(x + " ");
        }
}
