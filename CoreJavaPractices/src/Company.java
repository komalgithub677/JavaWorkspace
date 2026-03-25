
public class Company {
//	Encapsulate a static variable companyName inside a class.
	
	private static String companyName;
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setComapnyName(String companyName) {
		this.companyName = companyName;
	}
	
	public static void main(String[] args) {
		Company c = new Company();
		
		c.setComapnyName("Axis");
		System.out.println("Company 1 :  " + (c.getCompanyName()));
		c.setComapnyName("HDFC");
		System.out.println("Comapny name : " + (c.getCompanyName()));
	}
}
