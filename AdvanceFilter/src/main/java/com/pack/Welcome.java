package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<center><h1 style='color:green;'>Welcome to Servet<h1></center>");
		out.append("Your name is "+request.getParameter("name")+"<br>");
		InetAddress ad=InetAddress.getLocalHost();
		out.append("Your hosting address is "+ad.getHostAddress()+"<br>");
		out.print("Total number of visitor on site is "+Filter3.count+"<br>");
		out.print("Total time taken in the process is "+Filter3.time);
	}

}
