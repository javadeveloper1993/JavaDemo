package com.example.servlet.servletrequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
@WebServlet("/servletRequestHeaderInfo")
public class ServletRequestHeaderInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletRequestHeaderInfo() {
		System.out
				.println("\n ------- ServletRequestHeaderInfo Constructor Initialize ------- ");
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
		printWriter.print("<title>Header Information</title>");
		printWriter.print("<div><h3>All Header Information</h3></div>");
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerKey = (String) headerNames.nextElement();
			String headerValue = request.getHeader(headerKey);
			printWriter.print("<div></t><b>" + headerKey + "</b> : " + headerValue+"</div>");
		}
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
