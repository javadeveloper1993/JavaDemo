package com.example.servlet.filter;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Maulik
 * 
 */
public class EncryptCookieFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out
				.println(" == ------------------------  EncryptCookie Filter Init == ------------------------ ");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		Cookie[] cookies = httpServletRequest.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equalsIgnoreCase("JSESSIONID")) {
					System.out.println(" >>>>>>>>> Before Cookie Encrypt : "
							+ cookie.getValue());
					URLEncoder.encode(cookie.getValue());
					httpServletResponse.addCookie(cookie);
					System.out
							.println(" *********** In Encyption Filter ************ ");
					System.out.println(" >>>>>>>>> After Cookie Encrypt : "
							+ cookie.getValue());
				}
			}
		}

		chain.doFilter(httpServletRequest, httpServletResponse);

	}

	@Override
	public void destroy() {
		System.out
				.println(" == ------------------------  EncryptCookie Filter Destroy == ------------------------ ");
	}
}
