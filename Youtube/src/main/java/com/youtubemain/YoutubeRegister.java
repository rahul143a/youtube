package com.youtubemain;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/register1")
public class YoutubeRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String uname=request.getParameter("firstname");
		String uemail=request.getParameter("email");
		String umobile=request.getParameter("phone");
		String upwd=request.getParameter("password");
		RequestDispatcher dispatcher;
		Connection con=null;
		ResultSet rs=null;
		int rowCount=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?useSSL =false","root","root");

				PreparedStatement ps=con.prepareStatement("insert into register(username,useremail,userphone,userpassword) values(?,?,?,?)");
				
				ps.setString(1, uname);
				ps.setString(2, uemail);
				ps.setString(3, umobile);
				ps.setString(4, upwd);
				 rowCount=ps.executeUpdate();	
				 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dispatcher = request.getRequestDispatcher("register1.jsp");
				if (rowCount>0) {
					request.setAttribute("status", "success");
				}else {
					
						Statement st=con.createStatement();
						 rs=st.executeQuery("select * from register");
						 while (rs.next()) {
						 String name=rs.getString(2);
						 String email=rs.getString(3);
						 String phone=rs.getString(4);
						 String pass=rs.getString(5);
						if (name.equals(uname)) {
							request.setAttribute("status", "usernamefailed");
						}
						else if (email.equals(uemail)) {
							request.setAttribute("status", "useremailfailed");
						}
						else if (phone.equals(umobile)) {
							request.setAttribute("status", "userphonefailed");
						}
						else if (pass.equals(upwd)) {
							request.setAttribute("status", "userpasswordfailed");
						}
					}
				}
	            dispatcher.forward(request, response);
			
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
