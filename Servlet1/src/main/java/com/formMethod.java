package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formMethod")
public class formMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		String fname=request.getParameter("name1");
		String lname=request.getParameter("name2");
		String fnum=request.getParameter("num1");
		String lnum=request.getParameter("num2");
		if (fname=="") 
		{
			out.print("First name is empty"+"<br>");
		}
		else
		{
			out.print(" Helo "+fname);
		}
		if (lname=="") 
		{
			out.print("Last name is empty"+"<br>");
		}
		else
		{
			out.print(" "+lname+"<br>");
		}
		if (fnum.isEmpty()) 
		{
			out.print("First number is empty"+"<br>");
		}
		else
		{
			out.print("First number is "+fnum+"<br>");
		}
		if (lnum.isEmpty()) 
		{
			out.print("Last number is empty"+"<br>");
		}
		else
		{
			out.print("last number is "+lnum);
		}
		}
}
