package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
       public void fetchAllRecord() throws Exception{
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_425","root","Komal@mysql123");
    	   System.out.println("Connection successful");
    	   Statement s = c.createStatement();
    	   
    	   ResultSet rs = s.executeQuery("Select * from student ");
    	   
    	   while(rs.next()) {
    		   System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
    	   }
    	   
    	   c.close();
}
       
          public void insertData() throws Exception{
        	  Class.forName("com.mysql.cj.jdbc.Driver");
        	  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_425" , "root" ,"Komal@mysql123");
        	  
//        	  Statement s = c.createStatement();
//        	  
//        	  int check = s.executeUpdate("insert into instgramUser(id,name,email) values(11 , 'Komal' ,'knarawade4@gmail.com')");
        	  
        	  PreparedStatement ps =c.prepareStatement("insert into student(id ,name,city)values(? , ? ,?)");
        	  ps.setInt(1, 143);
        	  ps.setString(2, "Komal");
        	  ps.setString(3, "Pune");
        	  
        	  int check = ps.executeUpdate();
        	  
        	  if(check>0) {
        		  System.out.println("Data is inserted");
        	  }
        	  else {
        		  System.out.println("Data is not inserted");
        	  }
        	  
        	  c.close();
   }
          
          public void updateData() throws Exception{
        	  Class.forName("com.mysql.cj.jdbc.Driver");
        	  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_425" , "root" ,"Komal@mysql123");
        	  
        	  PreparedStatement ps = c.prepareStatement("update student set name=? city = ? where id =?");
        	  ps.setInt(1, 125);
        	 
        	 
        	  
        	  
        	  int check = ps.executeUpdate();
        	  
        	  if(check>0) {
        		  System.out.println("Data is updated");
        	  }
        	  else {
        		  System.out.println("Data is not updated");
        	  }
        	  
        	  c.close();
   }
          
          public void deleteData() throws Exception{
        	  Class.forName("com.mysql.cj.jdbc.Driver");
        	  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_425" , "root" ,"Komal@mysql123");
        	  
        	  PreparedStatement ps =c.prepareStatement("delete from student where id = ?") ;
        	  ps.setInt(1, 126);
        	  
        	  int check = ps.executeUpdate();
        	  
        	  if(check>0) {
        		  System.out.println("Data is deleted");
        	  }
        	  else {
        		  System.out.println("Data is not deleted");
        	  }
        	  
        	  c.close();
   }         
}
