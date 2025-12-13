package scanner;

import java.util.Scanner;

public class Bill {
             
	public void totalBill(int quantity , float price) {
		        int totalBill = (int) ((int) quantity * price);
		        System.out.println("Total bill would be : " + totalBill); 
	}
	public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		       
		       System.out.println("Enter the quantity of Product : ");
		       int quantity = sc.nextInt();
		       
		       System.out.println("Enter the price for the product");
		       float price = sc.nextFloat();
		       
		       Bill b = new Bill();
		       b.totalBill(quantity, price);
	}
}
