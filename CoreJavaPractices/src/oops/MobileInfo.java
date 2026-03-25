package oops;

public class MobileInfo {
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
	    double b1 =m.battery = 10.00;
		String b2 = m.brand = "Apple";
		String  r1 = m.ram ="16 GB";
		String s1 =m.storage = "256 SSD";
		
		System.err.println("Brand Details : ");
		System.out.println("Brand :" + b1);
		System.out.println("ram :" + r1 );
		System.out.println("battery :" + b1);
		System.out.println("Storage :" + s1);
	}

}
