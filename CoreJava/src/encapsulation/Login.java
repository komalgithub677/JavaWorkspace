package encapsulation;

public class Login {
//	Create a Login class with private variables username and password.
//	Allow login only if password length ≥ 8.
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username =username;
	}
	public String getPaswword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length()>=8) {
			this.password = password;
			System.out.println("Allowed Login");
		}
		else {
			System.out.println("Login invalid or invalid username");
		}
	}
}
