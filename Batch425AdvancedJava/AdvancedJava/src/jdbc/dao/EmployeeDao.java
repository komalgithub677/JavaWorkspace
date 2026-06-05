package jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class EmployeeDao {
             
	public void fetchAllRecord() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_425","root" ,"Komal@mysql123");
		Statement s = c.createStatement();
		
		ResultSet rs  = s.executeQuery("select * from Employee");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		
		c.close();)
	}
	
	public void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_425","root" ,"Komal@mysql123");
		Statement s = c.createStatement();
		
		int check = s.executeUpdate("update student set name= 'ghanshyam'  where id = 129");
		
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
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_425" ,"root" ,"Komal@mysql123");
		Statement s = c.createStatement();
		
		int check = s.executeUpdate("Delete from student where id =129");
		
		if(check>0) {
			System.out.println("Data is deleted");
		}
		else {
			System.out.println("Data is not deleted...!");
		}
		c.close();
	}

	public void insertData() {
		// TODO Auto-generated method stub
		
	}
	
}
