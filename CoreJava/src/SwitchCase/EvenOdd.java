package SwitchCase;

public class EvenOdd {
       public static void main(String[] args) {
		int num= 2;
		
		switch(num%2){
		case 0:
			System.out.println("Number is even");
		break;
		case 1:
			System.out.println("Number is odd");
		break;
		default:
			System.out.println("Invalid input");
		}
	}
}
