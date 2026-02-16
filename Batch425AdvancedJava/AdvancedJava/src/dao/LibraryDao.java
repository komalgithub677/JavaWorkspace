package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LibraryDao {
       public void fetchAllRecord() throws Exception{
    	   Class.forName("mysql.cj.jdbc.Driver");
    	   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch425","root","Komal@mysql123");
    	   System.out.println("Connection successful");
    	   Statement s = c.createStatement();
    	   
    	   ResultSet rs = s.executeQuery("Select * instagramUser");
    	   
    	   while(rs.next()) {
    		   System.out.println(rs.getInt(1) + " " + rs.getString(2));
    	   }
    	   
    	   c.close();
}
       
          public void insertData() throws Exception{
        	  Class.forName("mysql.cj.jdbc.Driver");
        	  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426" , "root" ,"Komal@mysql123");
        	  
        	  Statement s = c.createStatement();
        	  
        	  int check = s.executeUpdate("insert into instgramUser(id,name,email) values(11 , 'Komal' ,'knarawade4@gmail.com')");
        	  
        	  if(check>0) {
        		  System.out.println("Data is inserted");
        	  }
        	  else {
        		  System.out.println("Data is not inserted");
        	  }
        	  
        	  c.close();
   }
          
          public void updateData() throws Exception{
        	  Class.forName("mysql.cj.jdbc.Driver");
        	  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426" , "root" ,"Komal@mysql123");
        	  
        	  Statement s = c.createStatement();
        	  
        	  int check = s.executeUpdate("update instagramUser set name ='Monika' where id = 11");
        	  
        	  if(check>0) {
        		  System.out.println("Data is updated");
        	  }
        	  else {
        		  System.out.println("Data is not updated");
        	  }
        	  
        	  c.close();
   }
          
          public void deleteData() throws Exception{
        	  Class.forName("mysql.cj.jdbc.Driver");
        	  Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch426" , "root" ,"Komal@mysql123");
        	  
        	  Statement s = c.createStatement();
        	  
        	  int check = s.executeUpdate(" delete from intstagramUser where id = 11");
        	  
        	  if(check>0) {
        		  System.out.println("Data is deleted");
        	  }
        	  else {
        		  System.out.println("Data is not deleted");
        	  }
        	  
        	  c.close();
   }         
}
