package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/Urlmapping", "/sourav", "/aman" })
public class Urlmapping extends HttpServlet {
	private static final long serialVersionUID = 1L;
		ServletConfig config=null;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initizaltion of servlet");
		super.init(config);
		this.config=config;
	}
	public void destroy() {
		System.out.println("destroyed");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Servet is running");
		PrintWriter out=response.getWriter();
		out.print("hlo");
		out.print(config.getInitParameter("Student"));
	}

}
