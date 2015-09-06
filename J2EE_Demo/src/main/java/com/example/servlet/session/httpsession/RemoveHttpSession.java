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

import com.example.servlet.utils.HttpSessionInfo;

/**
 * @author Maulik
 * 
 */
@WebServlet("/removeHttpSession")
public class RemoveHttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveHttpSession() {
		System.out
				.println("\n ------- RemoveHttpSession Constructor Initialize ------- ");
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
		printWriter.print("<title>View Http Session</title>");
		printWriter.print("<html><body>");
		printWriter
				.print("<div><a href="
						+ request.getContextPath()
						+ "/httpSessionDemo target=_black> <<< Back to Http Session home</a></div>");
		printWriter
				.print("<div align='center'><h2>Remove Http Session Demo</h2></div>");
		printWriter
				.print("<div><h3>Before Remove Http Session Demo ( if Http Session not present then create new )</h3></div>");

		HttpSession httpSession = HttpSessionInfo.getHttpSession(request);
		printWriter.print(HttpSessionInfo
				.displayInfoAboutHttpSession(httpSession));

		httpSession.invalidate();

		HttpSession httpSession1 = HttpSessionInfo.getHttpSession(request,
				false);

		printWriter.print("<div><h3>After Remove Http Session Demo</h3></div>");
		printWriter.print(HttpSessionInfo
				.displayInfoAboutHttpSession(httpSession1));

		printWriter.print("</body></html>");
		printWriter.close();
	}

}
