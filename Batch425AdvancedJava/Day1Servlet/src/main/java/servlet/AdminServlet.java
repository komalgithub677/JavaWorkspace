//package servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.*;
//
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//
//@WebServlet("/admin")
//public class AdminServlet extends HttpServlet {
//
//protected void doGet(HttpServletRequest request,HttpServletResponse response){
//
//try{
//
//PrintWriter out = response.getWriter();
//
//Class.forName("com.mysql.cj.jdbc.Driver");
//
//Connection c = DriverManager.getConnection(
//"jdbc:mysql://localhost:3306/batch_425","root","Komal@mysql123");
//
//PreparedStatement ps = c.prepareStatement(
//"SELECT e.empName,a.date,a.checkIn,a.checkOut,a.workingHours,a.status FROM employee e JOIN attendance a ON e.empId=a.empId");
//
//ResultSet rs = ps.executeQuery();
//
//out.println("<h2>Employee Attendance Report</h2>");
//out.println("<table border='1'>");
//
//out.println("<tr>");
//out.println("<th>Name</th>");
//out.println("<th>Date</th>");
//out.println("<th>CheckIn</th>");
//out.println("<th>CheckOut</th>");
//out.println("<th>Hours</th>");
//out.println("<th>Status</th>");
//out.println("</tr>");
//
//while(rs.next()){
//
//out.println("<tr>");
//
//out.println("<td>"+rs.getString(1)+"</td>");
//out.println("<td>"+rs.getDate(2)+"</td>");
//out.println("<td>"+rs.getTime(3)+"</td>");
//out.println("<td>"+rs.getTime(4)+"</td>");
//out.println("<td>"+rs.getString(5)+"</td>");
//out.println("<td>"+rs.getString(6)+"</td>");
//
//out.println("</tr>");
//
//}
//
//out.println("</table>");
//
//}
//catch(Exception e){
//e.printStackTrace();
//}
//
//}
//
//}