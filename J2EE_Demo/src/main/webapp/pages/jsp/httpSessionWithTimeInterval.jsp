<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session Technique : Http Session With Time Interval</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/addHttpSessionWithTimeInterval">
  <div>
  	<div style="width:13%;float:left;">Max Time Interval :</div>
  	<div style="float:left;"><input type="text" name="maxTimeInterval" autocomplete="off"/></div>
  </div>
  <div style="clear: both;"></div>
  <br>
  <div>
  	<div style="margin-left: 13%;"><input type="submit" value="submit"></div>
  </div>
</form>
</body>
</html>