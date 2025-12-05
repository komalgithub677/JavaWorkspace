package oops.contructor;

public class Product {
//	5. Create a class Product using encapsulation and calculate discount using getter and setter methods
	
	private double price;
	private double percentage;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;	
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public double finalPrice() {
		double discount =(price*percentage) /100;
		double finalPrice = price -discount;
		return finalPrice;
	}
	

	
	
}
