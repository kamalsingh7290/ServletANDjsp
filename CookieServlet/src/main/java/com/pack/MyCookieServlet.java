package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyCookieServlet")
public class MyCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Cookie ck=new Cookie("username",request.getParameter("username").replace(" ","_"));
		ck.setMaxAge(5000);
		response.addCookie(ck);
		Cookie[] cookie=request.getCookies();
		if (cookie!=null) {
			for(Cookie c:cookie)
			{
				out.print("username is: "+c.getValue());
			}
		} else {
			out.print("There is not cookie stored");
		}
	}

}
