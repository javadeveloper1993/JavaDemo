package com.example.servlet.session.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.servlet.listner.HttpSessionBindingListenerDemo;
import com.example.servlet.utils.HttpSessionInfo;

/**
 * @author Maulik
 * 
 */
@WebServlet("/addHttpSessionWithAttribute")
public class AddHttpSessionWithAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddHttpSessionWithAttribute() {
		System.out
				.println("\n ------- AddHttpSessionWithAttribute Constructor Initialize ------- ");
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
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<title>Create Http Session With Attribute</title>");
		printWriter.print("<html><body>");
		printWriter
				.print("<div><a href="
						+ request.getContextPath()
						+ "/httpSessionDemo target=_black> <<< Back to Http Session home</a></div>");

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");

		HttpSession httpSession = HttpSessionInfo.createHttpSession(request,
				"FirstName", firstName, true);
		HttpSessionInfo.setHttpSessionAttribute(httpSession, "LastName",
				lastName, true);

		httpSession.setAttribute("Test", new HttpSessionBindingListenerDemo(
				request.getServletContext()));

		httpSession.removeAttribute("Test");

		printWriter
				.print("<div align='center'><h2>Create Http Session With Attribute</h2></div>");
		printWriter.print(HttpSessionInfo
				.displayInfoAboutHttpSession(httpSession));
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
