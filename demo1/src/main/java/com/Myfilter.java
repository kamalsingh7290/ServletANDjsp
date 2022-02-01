package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/Myclass")
public class Myfilter implements Filter {
	String a;
	public void init(FilterConfig fConfig) throws ServletException 
	{
	}
	public void destroy() 
	{
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		a=request.getParameter("name");
		if (a.equals("kamal")) 
		{
			out.print("name is correct go to servlet"+"\n");
			chain.doFilter(request, response);
		}
		else
		{
			out.print("SORRY name is not correct");
		}
	}
	

}
