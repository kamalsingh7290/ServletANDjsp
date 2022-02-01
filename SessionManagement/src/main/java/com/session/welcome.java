package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/welcome")
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		session.invalidate();//now session is deleted below code will give error
		PrintWriter out=response.getWriter();
		response.getWriter().append("hello "+session.getAttribute("name"));
		if (session==null) {
			out.print("no session");
		}
		else {
		response.getWriter().append((CharSequence) session.getAttribute("name"));
		}
	}
}
