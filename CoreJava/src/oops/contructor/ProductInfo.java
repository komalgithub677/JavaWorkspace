package oops.contructor;

public class ProductInfo {
             public static void main(String[] args) {
				Product p = new Product();
				p.setPrice(1000);
				p.setPercentage(10);
				
				System.out.println("Price would be :" + p.getPrice());
			    System.out.println("Percentage would be :" + p.getPercentage());
			    System.out.println("Final price would be :" + p.finalPrice());
			}
}
