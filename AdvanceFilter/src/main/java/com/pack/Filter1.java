package com.pack;
import java.io.IOException;
import java.net.InetAddress;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/Filter1")
public class Filter1 implements Filter {
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		InetAddress ad=InetAddress.getLocalHost();
		if (ad.getHostAddress().startsWith("192.168")||request.getRemoteAddr().startsWith("192.168")) {
			System.out.println("address matched");
			chain.doFilter(request, response);
		}
		else
		{
			response.getWriter().append("<center><h1 style='color:Red;'>Sorry Cannot Proceed<h1></center>!<br> <center><h2>Wrong IP address is catched OF your host</center></h2>");
			request.getRequestDispatcher("Error.html").include(request, response);
		}
		System.out.println("Response come to this filter from server");
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Ip Filter is initialized");
	}

}
