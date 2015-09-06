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
@WebServlet("/servletContextPropertiesInfo")
public class ServletContextPropertiesInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig servletConfig;
	private ServletContext servletContext;

	public ServletContextPropertiesInfo() {
		System.out
				.println("\n ------- ServletContextPropertiesInfo Constructor Initialize ------- ");
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
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<title>Servlet Context Properties Info</title>");
		printWriter.print(displayInfoAboutServletContext(request, response));
		printWriter.print("</body></html>");
		printWriter.close();
	}

	private String displayInfoAboutServletContext(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String servletContextInfo = "";
		servletContextInfo += "<div><b> 1. ContextPath : </b>"
				+ servletContext.getContextPath();
		servletContextInfo += "<div><b> 2. EffectiveMajorVersion : </b>"
				+ servletContext.getEffectiveMajorVersion();
		servletContextInfo += "<div><b> 3. EffectiveMinorVersion : </b>"
				+ servletContext.getEffectiveMinorVersion();
		servletContextInfo += "<div><b> 4. MajorVersion() : </b>"
				+ servletContext.getMajorVersion();
		servletContextInfo += "<div><b> 5. MinorVersion() : </b>"
				+ servletContext.getMinorVersion();
		servletContextInfo += "<div><b> 6. ServerInfo() : </b>"
				+ servletContext.getServerInfo();
		servletContextInfo += "<div><b> 7. ServletContextName : </b>"
				+ servletContext.getServletContextName();
		servletContextInfo += "<div><b> 8. VirtualServerName : </b>"
				+ servletContext.getVirtualServerName();
		servletContextInfo += "<div><b> 9. ClassLoader : </b>"
				+ servletContext.getClassLoader();
		servletContextInfo += "<div><b> 10. RealPath : </b>"
				+ servletContext.getRealPath(request.getServletPath());
		servletContextInfo += "<div><b> 11. All Resource Paths List : </b>"
				+ servletContext.getResourcePaths("/");
		servletContextInfo += "<div><b> 12. WEB-INF Resource Paths List : </b>"
				+ servletContext.getResourcePaths("/WEB-INF");
		servletContextInfo += "<div><b> 12. Get Resource : </b>"
				+ servletContext.getResource("/index.jsp");
		
		return servletContextInfo;
	}

}
