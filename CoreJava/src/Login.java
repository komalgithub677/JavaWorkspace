
public class Login {
//	Create a write-only class Login with a private password variable.
	private  String password;
	
	
	
	public void setPassword(String password) {
		this.password = password;
		System.out.println("Password set successfully");
	}
	
	public static void main(String[] args) {
		Login l = new Login();
		
		l.setPassword("MySecret@123");
	}
	
	
	
}
