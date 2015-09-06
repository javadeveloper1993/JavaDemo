package com.example.servlet.session.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
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
@WebServlet("/viewCookiesInfo")
public class ViewCookiesInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewCookiesInfo() {
		System.out
				.println("\n ------- ViewCookiesInfo Constructor Initialize ------- ");
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
		printWriter.print("<title>View Cookies</title><body>");
		printWriter
		.print("<div><a href="
				+ request.getContextPath()
				+ "/cookiesDemo target=_black> <<< Back to cookie home</a></div>");
		printWriter.print("<div align=center><h2>Cookie : View</h2></div>");
		printWriter.print("<br>");
		printWriter.print("<div style='margin-bottom:5px;'><b>Note : </b>Browser only send Cookie Name and Cookie Value But doesn't send other attribute of cookie like path, domain, maximum age , domain , comment, secure.</div>");
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie cookie : request.getCookies()){
				printWriter.print("<br><div><b>" + cookie.getName() + " : </b>"
						+ cookie.getValue() + "</div>");
				printWriter.print("<div style='margin-left:100px;'><b> Cookie isHttpOnly : </b>"
						+ cookie.isHttpOnly() + "</div>");
				printWriter.print("<div style='margin-left:100px;'><b> Cookie Age : </b>"
						+ cookie.getMaxAge() + "</div>");
				printWriter.print("<div style='margin-left:100px;'><b> Cookie Secure : </b>"
						+ cookie.getSecure() + "</div>");
				printWriter.print("<div style='margin-left:100px;'><b> Cookie Comment : </b>"
						+ cookie.getComment() + "</div>");
				printWriter.print("<div style='margin-left:100px;'><b> Cookie Domain : </b>"
						+ cookie.getDomain() + "</div>");
				printWriter.print("<div style='margin-left:100px;'><b> Cookie Path : </b>"
						+ cookie.getPath() + "</div>");
				printWriter.print("<div style='margin-left:100px;'><b> Cookie Version : </b>"
						+ cookie.getVersion() + "</div>");
			}
		}
		printWriter.print("</body></html>");
		printWriter.close();
	}
}
