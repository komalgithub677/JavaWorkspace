package model;

public class InstagramUser {
             private int id;
             private String  name;
             private String email;
             
             public void instagramUser(int id ,String name , String email) {
            	 this.id =id;
            	 this.name =name;
            	 this.email = email;
             }
             
             public int getid() {
            	 return id;
             }
             
             public String getUsername() {
            	 return name;
             }
             
             public String getEmail() {
            	 return email;
             }
}
