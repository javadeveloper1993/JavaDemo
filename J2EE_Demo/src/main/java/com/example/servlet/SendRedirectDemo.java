package com.example.servlet;

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
@WebServlet("/sendRedirectDemo")
public class SendRedirectDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;
	@SuppressWarnings("unused")
	private ServletContext servletContext;

	public SendRedirectDemo() {
		System.out
				.println("\n ------- SendRedirectDemo Constructor Initialize ------- ");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		servletConfig = config;
		servletContext = config.getServletContext();
		System.out.println("\n ------- Init Method Called For : "
				+ servletConfig.getServletName());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// String path = request.getContextPath()
		// + servletContext.getInitParameter("pathToJsp")
		// + "requestDispacherForward.jsp";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter printWriter = response.getWriter();
		response.sendRedirect(request.getContextPath()
				+ "/requestDispacherIncludeDemo");
		printWriter.close();
		System.out.println("Response Committed : " + response.isCommitted());
	}

}
