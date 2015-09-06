package com.example.servlet.servletrequest;

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
@WebServlet("/servletRequestPropertiesInfo")
public class ServletRequestPropertiesInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletRequestPropertiesInfo() {
		System.out
				.println("\n ------- ServletRequestPropertiesInfo Constructor Initialize ------- ");
	}

	@Override
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
		printWriter.print("<html><body>");
		printWriter.print("<title>Servlet Request Properties Info</title>");
		printWriter.print(displayInfoAboutServlet(request, response));
		printWriter.print("</body></html>");
		printWriter.close();
	}

	private String displayInfoAboutServlet(HttpServletRequest request,
			HttpServletResponse response) {
		String servletInfo = "";
		servletInfo+="<div><b> 1. CharacterEncoding : </b>"
				+ request.getCharacterEncoding()+"</div>";
		servletInfo+="<div><b> 2. ContentType : </b>" + request.getContentType()+ "</div>";
		servletInfo+="<div><b>3. ContextPath : </b>" + request.getContextPath()+ "</div>";
		servletInfo+="<div><b>4. LocalAddr : </b>" + request.getLocalAddr()+ "</div>";
		servletInfo+="<div><b>5. LocalName : </b>" + request.getLocalName()+ "</div>";
		servletInfo+="<div><b>6. LocalPort : </b>" + request.getLocalPort()+ "</div>";
		servletInfo+="<div>7<b>. Method : </b>" + request.getMethod()+ "</div>";
		servletInfo+="<div><b>8. PathInfo : </b>" + request.getPathInfo()+ "</div>";
		servletInfo+="<div><b>9. Protocol : </b>" + request.getProtocol()+ "</div>";
		servletInfo+="<div><b>10. RemoteAddr : </b>" + request.getRemoteAddr()+ "</div>";
		servletInfo+="<div><b>11. RemoteHost : </b>" + request.getRemoteHost()+ "</div>";
		servletInfo+="<div><b>12. RemotePort : </b>" + request.getRemotePort()+ "</div>";
		servletInfo+="<div><b>13. RemoteUser : </b>" + request.getRemoteUser()+ "</div>";
		servletInfo+="<div><b>14. RequestURI : </b>" + request.getRequestURI()+ "</div>";
		servletInfo+="<div><b>15. ServerName : </b>" + request.getServerName()+ "</div>";
		servletInfo+="<div><b>16. ServerPort : </b>" + request.getServerPort()+ "</div>";
		servletInfo+="<div><b>17. ServletPath : </b>" + request.getServletPath()+ "</div>";
		servletInfo+="<div><b>18. RequestURL : </b>" + request.getRequestURL()+ "</div>";
		return servletInfo;
	}

}
