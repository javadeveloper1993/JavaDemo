<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scriptlet Jsp Demo</title>
</head>
<%
	out.println("\nWelcome To Jsp");
	int count = 0;
%>
<body>
	<div>Page Count is : <%=count++%></div>
	<%!
		int data = 50;
		int cube(int n) {
			return n * n * n;
		}
	%>
	<div><%="Value of the variable is : " + data++ %></div>
	<div><%= "Cube of 4 is : " + cube(4) %> </div>
</body>
</html>