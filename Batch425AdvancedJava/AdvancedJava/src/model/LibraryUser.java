package model;

public class LibraryUser {
             private int id;
             private int bookid;
             private String  name;
             private String email;
             
             
             public void FaceBookUser(int id ,int bookid ,String name , String email ) {
            	 this.id =id;
            	 this.bookid = bookid;
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
