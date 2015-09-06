package com.example.servlet.servletcontext;

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
@WebServlet("/servletContextDemo")
public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;

	public ServletContextDemo() {
		System.out
				.println("\n ------- ServletContextDemo Constructor Initialize ------- ");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		servletConfig = config;
		System.out.println("\n ------- Init Method Called For : "
				+ servletConfig.getServletName());
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
		printWriter.print("<title>Servlet Context Demo</title>");
		printWriter
				.print("<br><div align=center><h2>Servlet Context Demo</h2></div>");
		printWriter
				.print("<div><label><b>1.</b></label><a href="
						+ request.getContextPath()
						+ "/servletContextInitParamInfo target=_black>Servlet Context Init Param Demo</a></div>");
		printWriter
		.print("<div><label><b>2.</b></label><a href="
				+ request.getContextPath()
				+ "/servletContextPropertiesInfo target=_black>Servlet Context Properties Info</a></div>");
		
		printWriter
		.print("<div><label><b>3.</b></label><a href="
				+ request.getContextPath()
				+ "/servletContextAttributeRemove target=_black>Servlet Context Attribute Remove</a></div>");
		
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
