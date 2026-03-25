//package servlet;
//
//import java.io.IOException;
//import java.sql.*;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//
//@WebServlet("/checkin")
//public class CheckInServlet extends HttpServlet {
//
//protected void doPost(HttpServletRequest request,HttpServletResponse response){
//
//try{
//
//Class.forName("com.mysql.cj.jdbc.Driver");
//
//Connection c = DriverManager.getConnection(
//"jdbc:mysql://localhost:3306/batch_425","root","Komal@mysql123");
//
//HttpSession session = request.getSession();
//int empId = (int) session.getAttribute("empId");
//
//PreparedStatement ps = c.prepareStatement(
//"INSERT INTO attendance(empId,date,checkIn,status) VALUES (?,CURDATE(),CURTIME(), IF(CURTIME()>'09:30:00','Late','On Time'))");
//
//ps.setInt(1,empId);
//
//ps.executeUpdate();
//
//response.sendRedirect("dashboard.jsp");
//
//}
//catch(Exception e){
//e.printStackTrace();
//}
//
//}
//
//}