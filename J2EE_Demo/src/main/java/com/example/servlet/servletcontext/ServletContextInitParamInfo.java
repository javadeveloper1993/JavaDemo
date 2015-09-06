package com.example.servlet.servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
@WebServlet("/servletContextInitParamInfo")
public class ServletContextInitParamInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;

	public ServletContextInitParamInfo() {
		System.out
				.println("\n ------- ServletContextInitParamInfo Constructor Initialize ------- ");
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
		printWriter.print("<title>Servlet Context Init Param Demo</title>");
		printWriter.print("<div><h3>All Servlet Context Init Param Information</h3></div>");
		ServletContext servletContext = servletConfig.getServletContext();
		Enumeration<String> initParameterNames = servletContext
				.getInitParameterNames();
		while (initParameterNames.hasMoreElements()) {
			String paramKey = (String) initParameterNames.nextElement();
			String paramValue = servletContext.getInitParameter(paramKey);
			printWriter.print("<div><b>Init-Param Key : </b>" + paramKey
					+ "  <b>Init-Param Value : </b>" + paramValue + "</div>");
		}
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
