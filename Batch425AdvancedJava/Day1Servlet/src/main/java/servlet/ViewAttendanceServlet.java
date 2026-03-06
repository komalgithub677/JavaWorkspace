package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/viewAttendance")
public class ViewAttendanceServlet extends HttpServlet {

protected void doGet(HttpServletRequest request,HttpServletResponse response){

try{

PrintWriter out = response.getWriter();

Class.forName("com.mysql.cj.jdbc.Driver");

Connection c = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/batch_425","root","Komal@mysql123");

PreparedStatement ps = c.prepareStatement(
"select * from attendance");

ResultSet rs = ps.executeQuery();

out.println("<h2>Attendance Report</h2>");
out.println("<table border='1'>");
out.println("<tr><th>ID</th><th>Date</th><th>CheckIn</th><th>CheckOut</th></tr>");

while(rs.next()){

out.println("<tr>");
out.println("<td>"+rs.getInt("empId")+"</td>");
out.println("<td>"+rs.getDate("date")+"</td>");
out.println("<td>"+rs.getTime("checkIn")+"</td>");
out.println("<td>"+rs.getTime("checkOut")+"</td>");
out.println("</tr>");

}

out.println("</table>");

}
catch(Exception e){
System.out.println(e);
}

}

}