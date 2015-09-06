package com.example.servlet.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/requestDispacherIncludeServletDemo")
public class RequestDispacherIncludeServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private ServletContext servletContext;

	public RequestDispacherIncludeServletDemo() {
		System.out
				.println("\n ------- RequestDispacherIncludeServletDemo Constructor Initialize ------- ");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		servletContext = config.getServletContext();
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
		printWriter.print("<html><body>");
		printWriter
				.print("<title>Request Dispacher Include Servlet Demo</title>");
		printWriter.print("<h3>Request Dispacher Include Servlet Demo</h3>");
		printWriter.print("<div><b>Before Dispatcher Type : </b>"
				+ request.getDispatcherType() + "</div>");
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("/requestDispacherForwardServlet");
		requestDispatcher.include(request, response);
		printWriter.print("<div><b>After Dispatcher Type : </b>"
				+ request.getDispatcherType() + "</div>");
		printWriter.print("</body></html>");
		printWriter.close();
	}
}
