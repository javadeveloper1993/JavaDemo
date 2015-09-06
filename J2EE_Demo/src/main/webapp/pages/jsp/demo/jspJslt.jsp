<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp : JSTL</title>
</head>
<body>
	<div>
		<c:catch>
		int a=10/0;  
	</c:catch>
	</div>


	<div>
		<c:out value="This is c:out">
		</c:out>
	</div>

	<%-- 	<c:import url="http://www.google.com" var="data"></c:import> --%>

	<!-- 	<h2>Data is:</h2> -->
	<%-- 	<c:out value="${data}"></c:out> --%>

	<div>
		<c:forEach var="number" begin="5" end="10">
			<c:out value="${number}"></c:out>
		</c:forEach>
	</div>


	<div>
			<c:set var="number" value="${100}"/>
			<c:if test="${number<500}" >
				<c:out value="number is less than 500"></c:out>
			</c:if>
	</div>
	
	<div>
<%-- 		<c:redirect url="/index.jsp" /> --%>
	</div>

</body>
</html>