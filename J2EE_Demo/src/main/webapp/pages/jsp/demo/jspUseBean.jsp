<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp:Use Bean</title>
</head>
<body>

	<jsp:useBean id="calculator" class="com.example.model.Calculator" scope="page" />

	<%
		int cube = calculator.cube(5);
		out.print("cube of 5 is : " + cube);
	%>

</body>
</html>