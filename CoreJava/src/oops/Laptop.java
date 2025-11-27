package oops;

public class Laptop {
       //Create a class Laptop with brand, RAM, and price & display all using a member method.
	   String brand;
	   int ram ;
	   int price;
	   
	   public static void main(String[] args) {
		
		   //First object creation from laptop class
		  //Classname ref = new Classname()
		   
		   Laptop l1 = new Laptop();
		   
		   String brand1 = l1.brand ="HP";
		   int price1 =  l1.price =25000;
		   int ram1 = l1.ram =16;
		   
		   System.err.println("First Brand Details : ");
		   System.out.println("Brand Name :" + brand1);
		   System.out.println("Laptop Price : " + price1);
		   System.out.println("Laptop ram :" + ram1);
		   
		   //Second object creation from Laptop class
		   
		   Laptop l2 = new Laptop();
		   
		   String brand2 = l2.brand = "Apple";
		   int price2 = l2.price= 100000;
		   int ram2 = l2.ram = 16;
		   
		   System.err.println("Second Brand Deatails : ");
		   System.out.println("Brand Name : " + brand2);
		   System.out.println("Brand Price : "+ price2);
		   System.out.println("Brand Ram : " + ram2);
		   
		   //Third Object Creation
		   
		   Laptop l3 = new Laptop();
		   
		   String brand3 = l3.brand = "Dell";
		   int price3 = l3.price = 40000;
		   int ram3 = l3.ram = 16;
		   
		   System.err.println("Third Brand Deatails : ");
		   System.out.println("Brand Name : " + brand3);
		   System.out.println("Brand Price : " + price3);
		   System.out.println("Brand Ram : " + ram3);
		  
		   
	}
	   
}
