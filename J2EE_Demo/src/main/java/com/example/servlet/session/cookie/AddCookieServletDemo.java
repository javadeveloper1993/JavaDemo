package com.example.servlet.session.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Maulik
 * 
 */
@WebServlet("/addCookieServletDemo")
public class AddCookieServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCookieServletDemo() {
		System.out
				.println("\n ------- AddCookieServletDemo Constructor Initialize ------- ");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
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
		printWriter.print("<html>");
		printWriter.print("<title>Create Cookies</title><body>");
		printWriter
				.print("<div><a href="
						+ request.getContextPath()
						+ "/cookiesDemo target=_black> <<< Back to cookie home</a></div>");
		String firstName = request.getParameter("firstName");
		String lastName = "A cookie is a small piece of information that is persisted between the multiple client requests."
				+ "A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age, and a version"
				+ "By default, each request is considered as a new request. In cookies technique, we add cookie with response from the servlet. So cookie is stored in the cache of the browser. After that if request is sent by the user, cookie is added with "
				+ "request by default. Thus, we recognize the user as the old "
				+ "For adding cookie or getting the value from the cookie, we need some methods provided by other interfaces. They are:"
				+ "A cookie is a small piece of information that is persisted between the multiple client requests."
				+ "A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age, and a version"
				+ "By default, each request is considered as a new request. In cookies technique, we add cookie with response from the servlet. So cookie is stored in the cache of the browser. After that if request is sent by the user, cookie is added with "
				+ "request by default. Thus, we recognize the user as the old "
				+ "For adding cookie or getting the value from the cookie, we need some methods provided by other interfaces. They are:"
				+ "A cookie is a small piece of information that is persisted between the multiple client requests."
				+ "A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age, and a version"
				+ "By default, each request is considered as a new request. In cookies technique, we add cookie with response from the servlet. So cookie is stored in the cache of the browser. After that if request is sent by the user, cookie is added with "
				+ "request by default. Thus, we recognize the user as the old "
				+ "For adding cookie or getting the value from the cookie, we need some methods provided by other interfaces. They are:"
				+ "A cookie is a small piece of information that is persisted between the multiple client requests."
				+ "A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age, and a version"
				+ "By default, each request is considered as a new request. In cookies technique, we add cookie with response from the servlet. So cookie is stored in the cache of the browser. After that if request is sent by the user, cookie is added with "
				+ "request by default. Thus, we recognize the user as the old "
				+ "For adding cookie or getting the value from the cookie, we need some methods provided by other interfaces. They are:"
				+ "A cookie is a small piece of information that is persisted between the multiple client requests."
				+ "A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age, and a version"
				+ "By default, each request is considered as a new request. In cookies technique, we add cookie with response from the servlet. So cookie is stored in the cache of the browser. After that if request is sent by the user, cookie is added with "
				+ "request by default. Thus, we recognize the user as the old "
				+ "For adding cookie or getting the value from the cookie, we need some methods provided by other interfaces. They are:"
				+ "A cookie is a small piece of information that is persisted between the multiple client requests."
				+ "A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age, and a version"
				+ "By default, each request is considered as a new request. In cookies technique, we add cookie with response from the servlet. So cookie is stored in the cache of the browser. After that if request is sent by the user, cookie is added with "
				+ "request by default. Thus, we recognize the user as the old "
				+ "For adding cookie or getting the value from the cookie, we need some methods provided by other interfaces. They are:"
				+ "request by default. Thus, we recognize the user as the old "
				+ "request by default. Thus, we recognize the user as the old "
				+ "request by default. Thus, we recognize the user as the old "
				+ "user. number." + "user. number." + "user. number.";
		// request.getParameter("lastName");

		Cookie firstNameCookie = new Cookie("firstName", firstName);
		firstNameCookie.setComment("This Cookie Store First Name");
		firstNameCookie.setHttpOnly(true);
		// TODO : If we set cookie for particular path then visible only that
		// path. Nothing see any other for servlet
		firstNameCookie.setPath(request.getContextPath());
		firstNameCookie.setDomain("localhost");
		//TODO : Set Maximum Age For Cookie (1 Year = 60*60*24*365 )  
		firstNameCookie.setMaxAge(60*60*24*365);

		Cookie lastNameCookie = new Cookie("lastName", lastName);
		lastNameCookie.setComment("This Cookie Store Last Name");
		lastNameCookie.setHttpOnly(false);
		// TODO : If we set cookie for particular path then visible only that
		// path. Nothing see any other for servlet
		lastNameCookie.setPath(request.getContextPath());
		lastNameCookie.setDomain("localhost");

		response.addCookie(firstNameCookie);
		response.addCookie(lastNameCookie);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printWriter.print("<h4>Cookie Create Sucessfully...!!!</h4>");
		System.out
				.println("----------- Cookie Create Sucessfully...!!! ------------ ");
		printWriter.print("</body></html>");
		printWriter.close();
	}

}
