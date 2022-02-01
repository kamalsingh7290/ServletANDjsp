package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginpage")
public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	RequestDispatcher obj;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		if (name.equals("kamal singh")&&password.equals("9667924332")) {
			obj=request.getRequestDispatcher("portfolio/portfolio.html");
			obj.forward(request, response);
		} else {
			obj=request.getRequestDispatcher("index.html");
			obj.include(request, response);
			out.print("<center><span style='color:red;position:relative; bottom:245px;'>Sorry! Invalid Username And Password</span></center>");
		}
	}

}
