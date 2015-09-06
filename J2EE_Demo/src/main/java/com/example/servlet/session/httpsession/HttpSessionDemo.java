package com.example.servlet.session.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/httpSessionDemo")
public class HttpSessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSessionDemo() {
    	System.out
		.println("\n ------- HttpSessionDemo Constructor Initialize ------- ");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("\n ------- Init Method Called For : "
				+ config.getServletName());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html>");
		printWriter.print("<title>Http Session Demo</title><body>");
		printWriter
				.print("<div align='center'><h3>Http Session Operation</h3></div>");
		printWriter
				.print("<div><label><b>1.</b></label><a href="
						+ request.getContextPath()
						+ "/createSimpleHttpSession target=_black>Create Simple Session</a></div>");
		printWriter
		.print("<div><label><b>2.</b></label><a href="
				+ request.getContextPath()
				+ "/createSimpleHttpSessionWithAttribute target=_black>Create Simple Session With Attribute</a></div>");
		
		printWriter
		.print("<div><label><b>3.</b></label><a href="
				+ request.getContextPath()
				+ "/createSimpleHttpSessionWithTimeInterval target=_black>Create Simple Session With Time Interval</a></div>");
		
		printWriter
		.print("<div><label><b>4.</b></label><a href="
				+ request.getContextPath()
				+ "/viewHttpSession target=_black>View Http Session</a></div>");
		
		printWriter
		.print("<div><label><b>5.</b></label><a href="
				+ request.getContextPath()
				+ "/removeHttpSession target=_black>Remove Http Session</a></div>");
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
