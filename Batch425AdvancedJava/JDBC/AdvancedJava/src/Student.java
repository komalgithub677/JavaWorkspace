import java.sql.*;

public class Student {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded...");

        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/batch_425",
                "root",
                "Komal@mysql123");

        System.out.println("Connection done....");

        Statement s = c.createStatement();

        int check = s.executeUpdate(
                "insert into student (id,name,city) values (125,'Shyam','Goa')");

        if (check > 0) {
            System.out.println("Data is inserted!");
        } else {
            System.out.println("Data is not inserted!");
        }

        ResultSet rs = s.executeQuery("Select * from student");

        while (rs.next()) {
            System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3));
        }

        c.close();
    }
}