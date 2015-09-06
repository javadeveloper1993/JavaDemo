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
@WebServlet("/servletRequestAttributeDemo")
public class ServletRequestAttributeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletRequestAttributeDemo() {
		System.out
				.println("\n ------- ServletRequestAttributeDemo Constructor Initialize ------- ");
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
		printWriter.print("<title>Http Servlet Request Attribute Demo</title>");
		printWriter
				.print("<br><div align=center><h2>Http Servlet Request Attribute Demo</h2></div>");
		request.setAttribute("Test", "Value 1");
		request.setAttribute("Request Attribute 2", "Value 2");

		request.removeAttribute("Request Attribute 2");
		// TODO :- More Ino :
		// http://www.thejavageek.com/2013/10/27/servlet-listeners-servletrequestattributelistener/
		request.setAttribute("Test", "Value");

		Enumeration<String> attributeNames = request.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String key = (String) attributeNames.nextElement();
			String value = (String) request.getAttribute(key);
			printWriter.print("<div style='margin-left:100px;'><b>" + key
					+ "</b> : " + value + "</div>");
		}

		printWriter.print("</body></html>");
		printWriter.close();
	}

}
