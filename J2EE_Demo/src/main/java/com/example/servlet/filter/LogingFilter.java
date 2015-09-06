package com.example.servlet.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Maulik
 * 
 */
public class LogingFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out
				.println(" == ------------------------  Loging Filter Init == ------------------------ ");
		System.out.println(" == ------------------------  FilterName : "
				+ filterConfig.getFilterName());
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		String ipAddress = httpServletRequest.getRemoteAddr();

		System.out.println(" == ***********************  In Filter : IP "
				+ ipAddress + ", Time " + new Date().toString());

		chain.doFilter(httpServletRequest, httpServletResponse);
	}

	@Override
	public void destroy() {
		System.out
				.println(" == ------------------------  Loging Filter Destroy  == ------------------------");
	}

}
