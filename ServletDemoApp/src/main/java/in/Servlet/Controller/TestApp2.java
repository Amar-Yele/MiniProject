package in.Servlet.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = { "/test" }, 
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/ServletDB"), 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "password", value = "1234")
		},
		loadOnStartup = 10)

public class TestApp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection = null;
	PreparedStatement pstmt = null;
	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	@Override
	public void init()throws ServletException{
		
		String url = getInitParameter("url");
		String username = getInitParameter("user");
		String password = getInitParameter("password");
		//Connection part 
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is successful....");
		}
		catch(SQLException e) {
			System.out.println("Connection is failed...");
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
//		Get the Parameter from HTML form
		String Name = request.getParameter("name");
		String City = request.getParameter("city");
		String Age = request.getParameter("age");
		String Email = request.getParameter("email");
		String Password= request.getParameter("pass");
		
		//Here write the Query part 
		String insertQuery = "insert into StudentForm(Name, City, Age, Email, Password) values(?,?,?,?,?)";
		
//		Prepare for the Statement 
		
		PrintWriter out = response.getWriter();
		try {
			if(connection != null) {
				pstmt = connection.prepareStatement(insertQuery);
			}
			if(pstmt != null) {
				pstmt.setString(1, Name);
				pstmt.setString(2, City);
				pstmt.setInt(3, Integer.parseInt(Age));
				pstmt.setString(4, Email);
				pstmt.setString(5, Password);
			}
			if(pstmt != null) {
				int rowAffected = pstmt.executeUpdate();
				if(rowAffected == 1) {
					out.println("<h1 style='color:Green; text-align:center;'>REGISTRATION IS SUCCESSFUL!</h1>");
				}
				else {
					out.println("<h1 style='color:Red; text-align:center;'>REGISTRATION IS FAILED!</h1>");
					out.println("<a href='./Registration.html>Register Again.?</a>");
				}
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		out.close();
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		try {
			if(connection != null) {
				connection.close();
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
