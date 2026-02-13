package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

    // 🔹 Common Connection Method
    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/batch_425?useSSL=false&serverTimezone=UTC",
                "root",
                "Komal@mysql123"   // ⚠️ Put your correct password
        );
    }

    // 🔹 Fetch All Records
    public void fetchAllRecord() throws Exception {
        Connection c = getConnection();

        PreparedStatement ps = c.prepareStatement("SELECT * FROM student");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + "   "
                    + rs.getString("name") + "   "
                    + rs.getString("city")
            );
        }

        c.close();
    }

    // 🔹 Insert Data
    public void insertData(int id, String name, String city) throws Exception {
        Connection c = getConnection();

        PreparedStatement ps = c.prepareStatement(
                "INSERT INTO student (id, name, city) VALUES (?, ?, ?)"
        );

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, city);

        int check = ps.executeUpdate();

        System.out.println(check > 0 ? "Data Inserted!" : "Insert Failed!");

        c.close();
    }

    // 🔹 Update Data
    public void updateData(int id, String newName) throws Exception {
        Connection c = getConnection();

        PreparedStatement ps = c.prepareStatement(
                "UPDATE student SET name = ? WHERE id = ?"
        );

        ps.setString(1, newName);
        ps.setInt(2, id);

        int check = ps.executeUpdate();

        System.out.println(check > 0 ? "Data Updated!" : "Update Failed!");

        c.close();
    }

    // 🔹 Delete Data
    public void deleteData(int id) throws Exception {
        Connection c = getConnection();

        PreparedStatement ps = c.prepareStatement(
                "DELETE FROM student WHERE id = ?"
        );

        ps.setInt(1, id);

        int check = ps.executeUpdate();

        System.out.println(check > 0 ? "Data Deleted!" : "Delete Failed!");

        c.close();
    }
}