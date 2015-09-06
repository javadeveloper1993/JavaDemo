<%@page info="This JSP Page Contain Demo For @Page Directive" contentType = "text/html" language="java" errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Directive Demo</title>
</head>
<body>
ServletInfo : - <%out.print(getServletInfo());%>;
 <%= 100/0 %>
</body>
</html>