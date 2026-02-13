package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
        public void fetchAllRecord()throws Exception{
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("Driver loaded...");
    		
    		Connection c = DriverManager.getConnection("jdbc:mysql//localhost:3306/batch_425" ,"root" ,"komal@mysql123");
    		System.out.println("Connection done....");
    		Statement s = c.createStatement();
    		s.executeUpdate("insert into student(id,name,city)values(129,'priya','nagpur')");
//    		s.executeUpdate("insert into student(id,name,city) ,values(123 ,'om','Pune')");
//    		s.executeUpdate("delete from student where id =");
//    		int check = s.executeUpdate("insert into student (id ,name,city)values(125,'Shyam','goa')");
//    		//executeUpdate 
//    		if(check>0) {
//    			System.out.println("Data is inserted....!");
//    		}
//    		else {
//    			System.out.println("Data is not inserted....");
//    		}
//    		System.out.println("Data is not inserted...!");
//    		
    		
    		//execute query
    		ResultSet rs = s.executeQuery("Select * from student");
    		
    		//loop is used extract the record
    		//rs.next() - method
    		
    		while(rs.next()) {
    			 System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
    		}
    		
    		c.close();
        }
        
        public void updateData()throws Exception{
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("Driver loaded...");
    		
    		Connection c = DriverManager.getConnection("jdbc:mysql//localhost:3306/batch_425" ,"root" ,"komal@mysql123");
    		System.out.println("Connection done....");
    		Statement s = c.createStatement();

    		ResultSet rs = s.executeQuery("Select * from student");
    		
    		//loop is used extract the record
    		//rs.next() - method
    		
    		while(rs.next()) {
    			 System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
    		}
    		
    		c.close();
        }
        
        
        public void deleteData()throws Exception{
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		System.out.println("Driver loaded...");
    		
    		Connection c = DriverManager.getConnection("jdbc:mysql//localhost:3306/batch_425" ,"root" ,"komal@mysql123");
    		System.out.println("Connection done....");
    		Statement s = c.createStatement();

    		ResultSet rs = s.executeQuery("Select * from student");
    		
    		//loop is used extract the record
    		//rs.next() - method
    		
    		while(rs.next()) {
    			 System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
    		}
    		
    		c.close();
        }
}
