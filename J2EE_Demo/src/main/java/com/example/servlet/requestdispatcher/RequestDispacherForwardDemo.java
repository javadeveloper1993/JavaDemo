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
@WebServlet("/requestDispacherForwardDemo")
public class RequestDispacherForwardDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private ServletContext servletContext;

	public RequestDispacherForwardDemo() {
		System.out
				.println("\n ------- RequestDispacherForwardDemo Constructor Initialize ------- ");
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
		printWriter.print("<title>Request Dispacher Forward Demo</title>");
		printWriter
				.print("<br><div align=center><h2>Request Dispacher Forward : Demo</h2></div>");
		printWriter
				.print("<div><label><b>1.</b></label><a href="
						+ request.getContextPath()
						+ "/requestDispacherForwardServletDemo target=_black>Forward To Servlet</a></div>");
		printWriter
				.print("<div><label><b>2.</b></label><a href="
						+ request.getContextPath()
						+ "/requestDispacherForwardJspDemo target=_black>Forward To Jsp</a></div>");
		printWriter.print("</body></html>");
		printWriter.close();
	}
}
