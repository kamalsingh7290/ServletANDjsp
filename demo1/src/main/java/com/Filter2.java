package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/Myclass")
public class Filter2 implements Filter {
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		int age=Integer.parseInt(request.getParameter("age")); 
		if(age==10)
		{
			out.print("your age is 10"+"\n");
			chain.doFilter(request, response);
		}
		else
		{
			out.print("your age is not 10 SORRY!"+"\n");
		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
