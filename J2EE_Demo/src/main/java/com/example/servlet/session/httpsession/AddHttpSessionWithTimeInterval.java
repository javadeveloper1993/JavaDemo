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
@WebServlet("/addHttpSessionWithTimeInterval")
public class AddHttpSessionWithTimeInterval extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddHttpSessionWithTimeInterval() {
		System.out
				.println("\n ------- AddHttpSessionWithTimeInterval Constructor Initialize ------- ");
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
		printWriter
				.print("<title>Create Http Session With Time Interval</title>");
		printWriter.print("<html><body>");
		printWriter
				.print("<div><a href="
						+ request.getContextPath()
						+ "/httpSessionDemo target=_black> <<< Back to Http Session home</a></div>");

		String timeInterval = request.getParameter("maxTimeInterval");
		HttpSession httpSession = null;
		if (timeInterval != null) {
			httpSession = HttpSessionInfo.createHttpSession(request, null,
					null, Integer.parseInt(timeInterval), true);
		} else {
			String timeOut = request.getServletContext().getInitParameter(
					"sessionTimeOut");
			Integer time = Integer.parseInt(timeOut) * 60;
			httpSession = HttpSessionInfo.createHttpSession(request, null,
					null, time, true);
		}

		printWriter
				.print("<div align='center'><h2>Create Http Session With Time Interval</h2></div>");
		printWriter.print(HttpSessionInfo
				.displayInfoAboutHttpSession(httpSession));
		printWriter.print("</body></html>");
		printWriter.close();
	}
}
