package com.example.servlet.servletrequest;

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
@WebServlet("/servletRequestInfo")
public class ServletRequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletRequestInfo() {
		System.out
				.println("\n ------- ServletRequestInfo Constructor Initialize ------- ");
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
		printWriter.print("<title>Http Servlet Request Demo</title>");
		printWriter.print("<br><div align=center><h2>Http Servlet Request Demo</h2></div>");
		printWriter
				.print("<div><label><b>1.</b></label><a href="
						+ request.getContextPath()
						+ "/servletRequestPropertiesInfo target=_black> Display Servlet Request Properties</a></div>");
		printWriter
				.print("<div><label><b>2.</b></label><a href="
						+ request.getContextPath()
						+ "/servletRequestHeaderInfo target=_black> Display All Header Information.</a></div>");
		printWriter
		.print("<div><label><b>3.</b></label><a href="
				+ request.getContextPath()
				+ "/servletRequestAttributeDemo target=_black> Servlet Request Attribute</a></div>");
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
