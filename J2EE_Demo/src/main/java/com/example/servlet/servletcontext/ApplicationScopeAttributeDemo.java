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
@WebServlet("/applicationScopeAttributeDemo")
public class ApplicationScopeAttributeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;
	private ServletContext servletContext;

	public ApplicationScopeAttributeDemo() {
		System.out
				.println("\n ------- ApplicationScopeAttributeDemo Constructor Initialize ------- ");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		servletConfig = config;
		servletContext = servletConfig.getServletContext();
		System.out.println("\n ------- Init Method Called For : "
				+ servletConfig.getServletName());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// TODO Create Application Scope Attribute
		servletContext.setAttribute("appType", "J2EE");
		servletContext.setAttribute("Test", "Test Value");
		servletContext.setAttribute(
				"servletVersion",
				servletContext.getMajorVersion() + "."
						+ servletContext.getMinorVersion());

		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<title>Application Scope Attribute Demo</title>");
		printWriter
				.print("<br><div align=center><h2>Application Scope Attribute Demo</h2></div>");
		printWriter
				.print("<br><div><h4>Get Application Scope Attribute</h2></div>");
		String appTypeAttribute = (String) servletContext
				.getAttribute("appType");
		String servletVersionAttribute = (String) servletContext
				.getAttribute("servletVersion");
		printWriter.print("<div><b>1. AppType Atribute : </b>"
				+ appTypeAttribute + "</div>");
		printWriter.print("<div><b>2. ServletVersion Atribute : </b>"
				+ servletVersionAttribute + "</div>");

		servletContext.removeAttribute("appType");
		
		servletContext.setAttribute("Test", "Again Test Value");
		
		
		String afterAppTypeAttribute = (String) servletContext
				.getAttribute("appType");
		String afterServletVersionAttribute = (String) servletContext
				.getAttribute("servletVersion");
		printWriter.print("<br><div><h4>Remove App Type Attribute</h2></div>");
		printWriter.print("<div><b>1. AppType Atribute : </b>"
				+ afterAppTypeAttribute + "</div>");
		printWriter.print("<div><b>2. ServletVersion Atribute : </b>"
				+ afterServletVersionAttribute + "</div>");

		printWriter.print("<br><div><h4>List Of All Attribute Demo</h2></div>");

		Enumeration<String> attributeNames = servletContext.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String attributeKey = (String) attributeNames.nextElement();
			if (servletContext.getAttribute(attributeKey) instanceof String) {
				System.out.println(attributeKey);
				String attributeValue = (String) servletContext
						.getAttribute(attributeKey);
				printWriter.print("<div><b>" + attributeKey + "</b> : "
						+ attributeValue + "</div>");
			}
		}
		printWriter.print("</body></html>");
		printWriter.close();
	}
}
