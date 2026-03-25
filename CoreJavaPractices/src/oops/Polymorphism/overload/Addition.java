package oops.Polymorphism.overload;

public class Addition {
//	5.Overload sum() using different data types:
//		sum(int, int)
//		sum(float, float)
	public void sum(int d ,int e) {
		System.out.println("Summation of two numbers : " + (d+e));
	}
	public void sum(float a , float b) {
		System.out.println("Summation of two float numbers : " + (a + b));
	}
	
	public static void main(String[] args) {
		Addition a = new Addition() ;
		a.sum(23, 32);
		a.sum(12.00f, 13.12f);
		
	}
}
