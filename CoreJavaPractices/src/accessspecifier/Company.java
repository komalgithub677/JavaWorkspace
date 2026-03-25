package accessspecifier;

public class Company {
//	Create class Company:
//
//		private variable revenue
//
//		protected method showRevenue()
//
//		public method display()
//
//		Call all valid members.
       private double revenue;
       
       protected void showRevenue() {
    	   System.out.println("This is the revenue of Company" + revenue);
       }
       
       public void display() {
    	   System.out.println("This is the display method of the Company Class");
       }
       
       public static void main(String[] args) {
		Company c = new Company();
		c.display();
		c.showRevenue();
		double revenue = c.revenue =30000;
		System.out.println("Revenue : " + revenue);
	}
}
