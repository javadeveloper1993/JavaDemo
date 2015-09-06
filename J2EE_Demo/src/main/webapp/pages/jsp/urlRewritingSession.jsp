<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session Technique : URL Rewriting</title>
</head>
<body>
<div align="center"><h3>Session Technique : URL Rewriting</h3></div>
<form method="post" action="${pageContext.request.contextPath}/urlReWritingSession">
  <div>
  	<div style="width:10%;float:left;">Name:</div>
  	<div style="float:left;"><input type="text" name="user" autocomplete="off"/></div>
  </div>
  <div style="clear: both;"></div>
  <br>
  <div>
  	<div style="width:10%;float:left;">password :</div>
  	<div style="float:left;"><input type="password" name="password" autocomplete="off"/></div>
  </div>
  <div style="clear: both;"></div>
  <br>
  <div>
  	<div style="margin-left: 10%;"><input type="submit" value="submit"></div>
  </div>
</form>
</body>
</html>