<!DOCTYPE html>
<%@page import="com.example.servlet.utils.HttpSessionInfo"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Implicit Object Demo</title>
<style type="text/css">
	.marginDiv{
		margin-left: 13%;
	}
</style>
</head>
<body>

	<div><b> Implicit Object : out</b></div>
	<div class="marginDiv"><% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %></div>
	
	
	
	<br>
	<div><b> Implicit Object : request</b></div> 
	<%request.setAttribute("jsp", "jsp value");%>
	<div class="marginDiv"><% out.print(request.getAttribute("jsp")); %></div>
	
	
	
	<br>
	<div><b> Implicit Object : response</b></div> 
	<div class="marginDiv"><% out.print(response.getContentType()); %></div>
	
	
	
	<br>
	<div><b> Implicit Object : config</b></div>
	<div class="marginDiv"><% out.print(config.getServletName()); %></div>
	
	
	
	<br>
	<div><b> Implicit Object : application</b></div>
	<div class="marginDiv"><% out.print(application.getInitParameter("pathToJsp")); %></div>
	
	
	
	<br>
	<div><b> Implicit Object : session</b></div>
	<div class="marginDiv"><%out.print(HttpSessionInfo.displayInfoAboutHttpSession(session));%>
	</div>
	
	
	
	<br>
	<div style="margin-left: -130px;"><b> Implicit Object : pageContext </b></div>
	<%
		pageContext.setAttribute("pageContextAttr1", "pageContextAttr1Value");
		pageContext.setAttribute("pageContextAttr2", "pageContextAttr2Value", 
									pageContext.APPLICATION_SCOPE);
		pageContext.setAttribute("pageContextAttr3", "pageContextAttr3Value", 
				pageContext.SESSION_SCOPE);
		
	%>
	<div class="marginDiv">
		<%
			out.print(pageContext.getAttribute("pageContextAttr1"));
		%>
	</div>
	<div class="marginDiv">
		<%
			out.print(pageContext.getAttributesScope("pageContextAttr2"));
		%>
	</div>
	<div class="marginDiv">
		<% out.print(application.getAttribute("pageContextAttr2")); %>
	</div>
	<div class="marginDiv">
		<% out.print(session.getAttribute("pageContextAttr3")); %>
	</div>
	
	
	
	<br>
	<div style="margin-left: -130px;"><b> Implicit Object : page</b></div>
		<div class="marginDiv">Same As Object Class ( Cast Any Object )
	</div>
	
	
	
</body>
</html>