package com.example.servlet.session.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
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
@WebServlet("/createSimpleHttpSessionWithAttribute")
public class CreateSimpleHttpSessionWithAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateSimpleHttpSessionWithAttribute() {
		System.out
				.println("\n ------- CreateSimpleHttpSessionWithAttribute Constructor Initialize ------- ");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("\n ------- Init Method Called For : "
				+ config.getServletName());
	}

	/**
	 * @throws IOException
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = request.getServletContext();
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<title>Create Http Session With Attribute</title>");
		printWriter.print("<html><body>");
		printWriter
				.print("<div align='center'><h2>Create Http Session With Attribute Demo</h2></div>");
		String path = servletContext.getInitParameter("pathToJsp")
				+ "httpSessionWithAttribute.jsp";
		servletContext.getRequestDispatcher(path).include(request, response);
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
