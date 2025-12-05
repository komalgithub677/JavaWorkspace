package oops.contructor;

public class VehicleInfo {
             public static void main(String[] args) {
				    Vehicle v = new Vehicle();
				    v.setBrand("Thar");
				    v.setPrice(50000000.00);
				    System.out.println("Brand name would be :" + v.getBrand());
				    System.out.println("Brand price would be : " + v.getPrice());
			}
}
