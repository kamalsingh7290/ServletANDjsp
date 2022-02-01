package com.session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		session.setAttribute("name",request.getParameter("username"));
		session.setAttribute("pass",request.getParameter("password"));
		System.out.println(session.getAttribute("name"));
		System.out.println(session.getCreationTime());
		System.out.println(session.getId());
		System.out.println(session.getLastAccessedTime());
		System.out.println(session.getMaxInactiveInterval());
		System.out.println(session.getValue("name"));
		Vector v=new Vector();
		Enumeration e=session.getAttributeNames();
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
		}
		response.sendRedirect("welcome");
	}
}
