package com.youtubemain;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginMain
 */
@WebServlet("/loginyoutube")
public class YoutubeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String uname= request.getParameter("username");
		String upwd=request.getParameter("password");

		HttpSession session = request.getSession();
		 Connection	con=null;
		 RequestDispatcher dispatcher;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?useSSL =false","root","root");
			PreparedStatement ps=con.prepareStatement("select * from  register where username = ? and userpassword = ?");
			ps.setString(1, uname);
			ps.setString(2, upwd);

			ResultSet rs= ps.executeQuery();
			
			if (rs.next()) {
			    session.setAttribute("name", rs.getString("username"));
			dispatcher =request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "faild");
				dispatcher = request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
