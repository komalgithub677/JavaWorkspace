import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
       public static void main(String[] args) throws Exception{
    	   //
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded...");
		
		Connection c = DriverManager.getConnection("jdbc:mysql//localhost:3306/batch_425" ,"root" ,"komal@mysql123");
		System.out.println("Connection done....");
		Statement s = c.createStatement();
		s.executeUpdate("insert into student(id,name,city) ,values(123 ,'om','Pune')");
		
		System.out.println("Data is not inserted...!");
		
		c.close();
		
		
		
		
		
		
	}  
}
