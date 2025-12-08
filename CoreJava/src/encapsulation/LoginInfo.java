package encapsulation;

public class LoginInfo {
             public static void main(String[] args) {
				Login l =new Login();
				l.setUsername("komal");
				l.setPassword("komal@1");
				System.out.println("Username :" + l.getUsername());
				System.out.println("Password : " + l.getPaswword());
			}
}
