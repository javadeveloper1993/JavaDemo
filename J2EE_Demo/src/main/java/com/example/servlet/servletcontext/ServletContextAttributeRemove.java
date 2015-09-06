package com.example.servlet.servletcontext;

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
@WebServlet("/servletContextAttributeRemove")
public class ServletContextAttributeRemove extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;

	public ServletContextAttributeRemove() {
		System.out
				.println("\n ------- ServletContextAttributeRemove Constructor Initialize ------- ");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		servletConfig = config;
		System.out.println("\n ------- Init Method Called For : "
				+ servletConfig.getServletName());
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html><body>");
		printWriter
				.print("<title>Servlet Context Attribute Remove Demo</title>");
		printWriter
				.print("<br><div align=center><h2>Servlet Context Attribute Remove Demo</h2></div>");

		ServletContext servletContext = servletConfig.getServletContext();
		servletContext.getRequestDispatcher("/applicationScopeAttributeDemo")
				.include(request, response);

		printWriter.print("</body></html>");
		printWriter.close();

	}
}
