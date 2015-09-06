package com.example.servlet.session.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Maulik
 * 
 */
@WebServlet("/createMultipleCookieServletPageDemo")
public class CreateMultipleCookieServletPageDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateMultipleCookieServletPageDemo() {
		System.out
				.println("\n ------- CreateMultipleCookieServletPageDemo Constructor Initialize ------- ");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("\n ------- Init Method Called For : "
				+ config.getServletName());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html>");
		printWriter.print("<title>Create Cookies</title><body>");
		printWriter
				.print("<div><a href="
						+ request.getContextPath()
						+ "/cookiesDemo target=_black> <<< Back to cookie home</a></div>");
		printWriter
				.print("<div align='center'><h3>Multiple Cookie Create</h3></div>");
		for (int i = 1; i <= 100; i++) {
			String key = String.valueOf(i);
			Cookie cookie = new Cookie(key, key);
			cookie.setPath(request.getContextPath());
			cookie.setDomain("localhost");
			response.addCookie(cookie);
			System.out.println(" --------- " + i + " -------- Created...!!!");
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printWriter.print("<h4>Multiple Cookie Create Sucessfully...!!!</h4>");
		System.out
				.println("----------- Cookie Create Sucessfully...!!! ------------ ");
		printWriter.close();
	}
}
