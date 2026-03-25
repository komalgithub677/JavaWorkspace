package practice;

public class OverloadC {
             
	         OverloadC(){
	        	 System.out.println("This is the no args constructor of overload class");
	         }
	         
	         OverloadC(int a){
	        	 System.out.println("This is the args constructor of overload class");
	        	 System.out.println("A :" + a);
	         }
	         
	         OverloadC(int a ,int b){
	        	 System.out.println("This is the two args constructor of the overload class ");
	        	 System.out.println("Addition of two number : " + (a+b));
	         }
	         
	         public static void main(String[] args) {
				OverloadC c1 = new OverloadC();
				OverloadC c2 = new OverloadC(2);
				OverloadC c3 = new OverloadC(2,4);
				
				
			}
	         
}
