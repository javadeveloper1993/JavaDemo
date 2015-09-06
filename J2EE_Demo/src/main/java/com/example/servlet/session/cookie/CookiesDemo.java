package com.example.servlet.session.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Maulik
 * 
 */
@WebServlet("/cookiesDemo")
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CookiesDemo() {
		System.out
				.println("\n ------- CookiesDemo Constructor Initialize ------- ");
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
		printWriter.print("<title>Cookies Demo</title><body>");
		String checkCookieEnable = "<script>" + "if(navigator.cookieEnabled){"
				+ "alert('Cookie is Enable');" + "}else{"
				+ "alert('Cookie is Disable');" + "}" + "</script>";
		printWriter.print(checkCookieEnable);
		printWriter
				.print("<div align='center'><h3>Cookies Operation</h3></div>");
		printWriter
				.print("<div><label><b>1.</b></label><a href="
						+ request.getContextPath()
						+ "/createCookieServletPageDemo target=_black>Create Cookie</a></div>");
		printWriter
				.print("<div><label><b>2.</b></label><a href="
						+ request.getContextPath()
						+ "/createMultipleCookieServletPageDemo target=_black>Create Multiple Cookie</a></div>");
		printWriter.print("<div><label><b>3.</b></label><a href="
				+ request.getContextPath()
				+ "/viewCookiesInfo target=_black>View Cookie Info</a></div>");
		// printWriter
		// .print("<div><label><b>3.</b></label><a href="
		// + request.getContextPath()
		// + "/removeCookies target=_black>Remove All Cookie</a></div>");
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
