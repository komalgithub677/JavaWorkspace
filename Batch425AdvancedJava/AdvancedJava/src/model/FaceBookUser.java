package model;

public class FaceBookUser {
             private int id;
             private String  name;
             private String email;
             private long mobNo;
             
             public void FaceBookUser(int id ,String name , String email,long mobNo) {
            	 this.id =id;
            	 this.name =name;
            	 this.email = email;
            	 this.mobNo = mobNo;
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
             
             public long getMob() {
            	 return mobNo;
             }
}
