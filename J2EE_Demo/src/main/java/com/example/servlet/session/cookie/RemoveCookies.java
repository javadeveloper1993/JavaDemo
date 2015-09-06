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
@WebServlet("/removeCookies")
public class RemoveCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveCookies() {
		System.out
				.println("\n ------- RemoveCookies Constructor Initialize ------- ");
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
		printWriter.print("<title>Remove Cookies</title><body>");
		printWriter
		.print("<div><a href="
				+ request.getContextPath()
				+ "/cookiesDemo target=_black> <<< Back to cookie home</a></div>");
		printWriter.print("<div align=center><h2>Cookie : Remove</h2></div>");
		for(Cookie cookie : request.getCookies()){
			cookie.setMaxAge(0);
//			response.addCookie(cookie);
			printWriter.print("<div><b> "+cookie.getName() + "</b> has been removed ...!!!</div>");
		}
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		printWriter.print("<h4>Cookie Remove Sucessfully...!!!</h4>");
		System.out
				.println("----------- Cookie Remove Sucessfully...!!! ------------ ");
		printWriter.print("</body></html>");
		printWriter.close();
	}
}
