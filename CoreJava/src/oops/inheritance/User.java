package oops.inheritance;

public class User extends Amazon {
                  public static void main(String[] args) {
					Instagram i = new Instagram();
					i.myMsg();
					i.myRegister();
					i.myLogin();
					i.profile();
					i.story();
					i.reels();
					
					System.out.println("*************");
					
					
					Whatsapp w = new Whatsapp();
					w.myMsg();
					w.myRegister();
					w.myLogin();
					w.profile();
					w.myStatus();
					w.myLocation();
					
				
					System.out.println("**************");
					
					Facebook f = new Facebook();
					f.myMsg();
					f.myRegister();
					f.myLogin();
					f.profile();
					f.myPost();
					f.myPost();
				}
}
