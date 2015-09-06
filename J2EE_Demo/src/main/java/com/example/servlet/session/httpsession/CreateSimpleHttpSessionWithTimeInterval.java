package com.example.servlet.session.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
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
@WebServlet("/createSimpleHttpSessionWithTimeInterval")
public class CreateSimpleHttpSessionWithTimeInterval extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateSimpleHttpSessionWithTimeInterval() {
		System.out
				.println("\n ------- CreateSimpleHttpSessionWithTimeInterval Constructor Initialize ------- ");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("\n ------- Init Method Called For : "
				+ config.getServletName());
	}

	/**
	 * @throws IOException
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = request.getServletContext();
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<title>Create Http Session With Time Interval</title>");
		printWriter.print("<html><body>");
		printWriter
				.print("<div align='center'><h2>Create Http Session With Time Interval Demo</h2></div>");
		String path = servletContext.getInitParameter("pathToJsp")
				+ "httpSessionWithTimeInterval.jsp";
		servletContext.getRequestDispatcher(path).include(request, response);
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
