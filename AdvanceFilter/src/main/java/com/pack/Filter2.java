package com.pack;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/Filter2")
public class Filter2 implements Filter {
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		if (name.equals("kamal")&&pass.equals("1234"))
		{
			System.out.println("Name and pass is correct");
			chain.doFilter(request, response);
		}
		else
		{
			response.getWriter().append("<center><h1 style='color:Red;'>Sorry Cannot Proceed<h1></center>!<br> <center><h2>Incorrect Name and passsword Issue</center></h2>");
			request.getRequestDispatcher("Error.html").include(request, response);;
		}
		System.out.println("Response came to Authenication filter back");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Authenfication filter is invoked");
	}

}
