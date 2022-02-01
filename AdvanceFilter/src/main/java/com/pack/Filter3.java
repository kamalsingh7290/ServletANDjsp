package com.pack;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/Filter3")
public class Filter3 implements Filter {
	static int count=0;
	static long time=0;
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("total count is "+(++count));
		long before=System.nanoTime();
		chain.doFilter(request, response);
		System.out.println("count filter is again invoked from server side");
		long after=System.nanoTime();
		time=(after-before);
		System.out.println(time);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Count filter in invoked and initalized");
	}

}
