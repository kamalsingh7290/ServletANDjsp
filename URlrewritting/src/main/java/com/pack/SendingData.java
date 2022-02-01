package com.pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Url;

@WebServlet("/SendingData")
public class SendingData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().append("Hlo this is servlet\n Click on the link if you want of jump on second page "
				+ "through url");
		response.getWriter().append("<a href='UrlServlet?uname="+request.getParameter("username")+"'>visit</a>");
	}

}
