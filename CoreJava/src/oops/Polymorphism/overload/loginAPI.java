package oops.Polymorphism.overload;

public class loginAPI {
	//1>different datatypes
	//2>Number of parameters
	//3>
             int getOtp(long mobNo) {
            	 return 12345;
             }
             String getOtp(String email) {
            	 return "aexft45678";
             }
             String getOtp( long mobNo , String email) {
            	 return "Aeeef45678";
             }
             public static void main(String[] args) {
				loginAPI l =new loginAPI();
				System.out.println(l.getOtp(9373937250l));
			    System.out.println(	l.getOtp("knarawade4@gmail.com"));
				System.out.println(l.getOtp(9373937250l, "knarawade4@gmail.com"));
			}
}
