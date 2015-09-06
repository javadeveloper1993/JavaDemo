package com.example.servlet.requestdispatcher;

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
@WebServlet("/requestDispacherDemo")
public class RequestDispacherDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RequestDispacherDemo() {
		System.out
				.println("\n ------- RequestDispacherDemo Constructor Initialize ------- ");
	}

	@Override
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
		printWriter.print("<html><body>");
		printWriter.print("<title>Request Dispacher Demo</title>");
		printWriter
				.print("<br><div align=center><h2>Request Dispacher Demo</h2></div>");
		printWriter
				.print("<div><label><b>1.</b></label><a href="
						+ request.getContextPath()
						+ "/requestDispacherForwardDemo target=_black>Forward</a></div>");
		printWriter
				.print("<div><label><b>2.</b></label><a href="
						+ request.getContextPath()
						+ "/requestDispacherIncludeDemo target=_black>Include</a></div>");
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
