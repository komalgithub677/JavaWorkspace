package oops;

public class Car {
	         //Global variables
	         String brand;
	         String color;
	         int price;
	         
             public static void main(String[] args) {
				
            	 Car c = new Car();
            	 //local variables
            	 String brand = c.brand = "Toyota";
            	 String color = c.color ="Black";
            	 int price = c.price =3000000;
            	 
            	 System.out.println("Brand of car :" + brand);
            	 System.out.println("Color of car : " +color );
            	 System.out.println("Price of car : " + price);  	 
            	 }
}
