package com.example.servlet.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Maulik
 *
 */
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;

	public ServletConfigDemo() {
		System.out
				.println("\n ------- ServletConfigDemo Constructor Initialize ------- ");
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
		printWriter.print("<title>Servlet Config Information</title>");
		printWriter
				.print("<div><h2>Servlet Config Init Param Key: value </h2></div>");
		Enumeration<String> initParameterNames = servletConfig
				.getInitParameterNames();
		while (initParameterNames.hasMoreElements()) {
			String paramKey = (String) initParameterNames.nextElement();
			String paramValue = servletConfig.getInitParameter(paramKey);
			printWriter.print("<div><b>Init-Param Key : </b>" + paramKey
					+ "  <b>Init-Param Value : </b>" + paramValue + "</div>");
		}
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
