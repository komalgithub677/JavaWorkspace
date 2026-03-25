package encapsulation;

public class Logins {
//	Create a class Login with private variable password.
//	Provide only a setter method (no getter).
//	Explain why getter is not provided.
	private String password;
	
	public void  setpassword(String password) {
		 this.password = password;
	}
	
	public static void main(String[] args) {
		Logins l = new Logins();
		 l.setpassword("Komal@123");
		System.out.println("Password Set Successfully ");
	}
}
