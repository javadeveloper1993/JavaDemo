package com.example.servlet.requestdispatcher;

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
@WebServlet("/requestDispacherForwardServlet")
public class RequestDispacherForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private ServletContext servletContext;

	public RequestDispacherForwardServlet() {
		System.out
				.println("\n ------- RequestDispacherForwardServlet Constructor Initialize ------- ");
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
				.print("<title>Request Dispacher Forward From Servlet</title>");
		printWriter
				.print("<br><div align=center><h2>Request Dispacher Forward From Servlet</h2></div>");
		printWriter.print("<div><b>DispatcherType : </b>"
				+ request.getDispatcherType()+"</div>");
		printWriter.print("<div><b>RequestURI : </b>"
				+ request.getRequestURI()+"</div>");
		printWriter.print("<div><b>Request Referer Url ( Get By Clicking On Link Or Form Submission ) : </b>"
				+ request.getHeader("referer")+"</div>");
		printWriter.print("<div><b>Response Referer Url : </b>"
				+ response.getHeader("referer")+"</div>");
		printWriter.print("</body></html>");
		printWriter.close();
	}
}
