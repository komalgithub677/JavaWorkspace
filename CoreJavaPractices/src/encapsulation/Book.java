package encapsulation;

public class Book {
//	Write a program to create a Book class with private variables title and price.
//	Set and get values using methods.
	private String title;
	private float price;
	
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
