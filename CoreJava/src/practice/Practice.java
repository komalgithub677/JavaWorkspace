package practice;

public class Practice {
	         int id;
	         String name;
	         String address;
	         
//	         Practice(int id ,String name){
//	        	 this.id =id;
//	        	 this.name = name;
//	         }
//	         
//	         Practice(int id , String name , String address){
//	        	 this.id = id;
//	        	 this.name =name;
//	        	 this.address =address;
//	         }
	         
	         public void add(int a ,int b) {
	        	 System.out.println("Addition of two numbers : " + (a + b)); 
	         }
	         
	         public void substract(int c , int d) {
	        	 System.out.println("Substraction of two numbers : " + (c-d));
	         }
	         
	         public void start() {
	        	 System.out.println("Start method of the vehicle class");
	         }
	         
       public static void main(String[] args) {
	   Practice p = new Practice();
	   Practice p1 = new Practice();
	   
	   p.add(12, 13);
	   p.substract(40, 20);
	}
}
