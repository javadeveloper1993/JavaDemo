package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Maulik
 * 
 */
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyFirstServlet() {
		System.out
				.println("\n ------- MyFirstServlet Constructor Initialize ------- ");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("\n ------- Init Method Called For : "
				+ config.getServletName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" >>> getServletContext().getContextPath() :: "
				+ getServletContext().getContextPath());
		response.setContentType("text/html");
		response.setIntHeader("Refresh", 15);
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<h3>This is my first servlet demo.</h3>");
		printWriter.print("</body></html>");
		printWriter.close();
		displayInfoAboutServlet(request, response);
	}

	private void displayInfoAboutServlet(HttpServletRequest request,
			HttpServletResponse response) {
		System.out
				.println("\n ****************** Servlet Request Information *****************");
		System.out.println("1> CharacterEncoding : "
				+ request.getCharacterEncoding());
		System.out.println("2> ContentType : " + request.getContentType());
		System.out.println("3> ContextPath : " + request.getContextPath());
		System.out.println("4> LocalAddr : " + request.getLocalAddr());
		System.out.println("5> LocalName : " + request.getLocalName());
		System.out.println("6> LocalPort : " + request.getLocalPort());
		System.out.println("7> Method : " + request.getMethod());
		System.out.println("8> PathInfo : " + request.getPathInfo());
		System.out.println("9> Protocol : " + request.getProtocol());
		System.out.println("10> RemoteAddr : " + request.getRemoteAddr());
		System.out.println("11> RemoteHost : " + request.getRemoteHost());
		System.out.println("12> RemotePort : " + request.getRemotePort());
		System.out.println("13> RemoteUser : " + request.getRemoteUser());
		System.out.println("14> RequestURI : " + request.getRequestURI());
		System.out.println("15> ServerName : " + request.getServerName());
		System.out.println("16> ServerPort : " + request.getServerPort());
		System.out.println("17> ServletPath : " + request.getServletPath());
		System.out.println("18> RequestURL : " + request.getRequestURL());
		System.out
				.println("\n ****************** Servlet Response Information *****************");
		System.out.println("1> CharacterEncoding : "
				+ response.getCharacterEncoding());
		System.out.println("2> ContentType : " + response.getContentType());
	}

}
