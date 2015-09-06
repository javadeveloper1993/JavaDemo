package com.example.servlet.session.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Maulik
 * 
 */
@WebServlet("/createCookieServletPageDemo")
public class CreateCookieServletPageDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateCookieServletPageDemo() {
		System.out
				.println("\n ------- CreateCookie Constructor Initialize ------- ");
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
		ServletContext servletContext = request.getServletContext();
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html>");
		printWriter.print("<title>Create Cookies</title><body>");
		printWriter
				.print("<div><a href="
						+ request.getContextPath()
						+ "/cookiesDemo target=_black> <<< Back to cookie home</a></div>");
		printWriter.print("<div align='center'><h3>Create Cookies </h3></div>");
		printWriter.print("</body></html>");
		String path = servletContext.getInitParameter("pathToJsp")
				+ "createCookie.jsp";
		servletContext.getRequestDispatcher(path).include(request, response);
		printWriter.close();
	}

}
