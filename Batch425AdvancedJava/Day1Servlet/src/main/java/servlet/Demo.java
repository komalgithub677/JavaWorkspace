package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;

import com.sun.net.httpserver.Request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Demo extends HttpServlet {
       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String name1 = request.getParameter("name");
    	String email1 =request.getParameter("email");
    	String dob = request.getParameter("dob");
    	
    	PrintWriter out = response.getWriter();
    	out.print(name1);
    	out.print(email1);
    	out.print(dob);	
    }      
}














