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
@WebServlet("/requestDispacherIncludeJspDemo")
public class RequestDispacherIncludeJspDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext servletContext;

	public RequestDispacherIncludeJspDemo() {
		System.out
				.println("\n ------- RequestDispacherIncludeJspDemo Constructor Initialize ------- ");
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
		response.setHeader("referer", request.getRequestURL().toString());
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<title>Request Dispacher Include Jsp Demo</title>");
		String path = servletContext.getInitParameter("pathToJsp")
				+ "requestDispacherForward.jsp";
		System.out.println("path : " + path);
		printWriter.print("<div>Before Include </div>");
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher(path);
		requestDispatcher.include(request, response);
		printWriter.print("<br><div>After Include </div>");
	}
}
