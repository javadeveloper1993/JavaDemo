<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<title>Jsp : Use Bean (Set Property & Get Property)</title>
</head>
<body>

	<jsp:useBean id="student" class="com.example.model.Student" />
	<jsp:useBean id="student1" class="com.example.model.Student" />

	<jsp:setProperty property="firstName" name="student" value="Maulik" />
	<jsp:setProperty property="middelName" name="student" value="J" />
	<jsp:setProperty property="lastName" name="student" value="Patel" />
	<jsp:setProperty property="age" name="student" value="19" />

	<jsp:setProperty property="firstName" name="student1" value="Parth" />
	<jsp:setProperty property="middelName" name="student1" value="J" />
	<jsp:setProperty property="lastName" name="student1" value="Patel" />
	<jsp:setProperty property="age" name="student1" value="35" />

	<div><jsp:getProperty name="student1" property="firstName" /></div>
	<div><jsp:getProperty name="student" property="middelName" /></div>
	<div><jsp:getProperty name="student" property="lastName" /></div>
	<div><jsp:getProperty name="student1" property="age" /></div>

</body>
</html>