package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
//@WebFilter("/MainFilter")
public class MainFilter implements Filter {	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("called");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		if (name.equals("kamal")) 
		{
			chain.doFilter(request, response);
			response.getWriter().append(name);

		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	@Override
	public void destroy() {
		
	}

}
