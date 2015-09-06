<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>J2EE App Index Page</title>
<style type="text/css">
.divMarginTop {
	margin-top: 5px;
}
</style>
<script type="text/javascript">
</script>
</head>
<body>
	<div align="center">
		<h2>Index For Servlet Demo</h2>
	</div>

	<!-- Servlet Demo List  -->
	<div>

		<!-- My First Servlet Demo  -->
		<div class="divMarginTop">
<%-- 		href='${pageContext.request.contextPath}/myFirstServlet?JSESSIONID=<%=request.getCookies()[0].getValue()%>' --%>
			<label><b>1.</b></label><a
				href='${pageContext.request.contextPath}/myFirstServlet'
				target="_black"> My First Servlet Demo</a>
		</div>

		<!-- Display Servlet Request Information  -->
		<div class="divMarginTop">
			<label><b>2.</b></label><a
				href="${pageContext.request.contextPath}/servletRequestInfo"
				target="_black"> Servlet Request Information</a>
		</div>

		<!-- Display Servlet Config Information  -->
		<div class="divMarginTop">
			<label><b>3.</b></label><a
				href="${pageContext.request.contextPath}/servletConfigDemo"
				target="_black"> Servlet Config Demo</a>
		</div>

		<!-- Display Servlet Context Information  -->
		<div class="divMarginTop">
			<label><b>4.</b></label><a
				href="${pageContext.request.contextPath}/servletContextDemo"
				target="_black"> Servlet Context Demo</a>
		</div>

		<!-- Display Servlet Attribute Information  -->
		<div class="divMarginTop">
			<label><b>5.</b></label><a
				href="${pageContext.request.contextPath}/servletContextAttributeDemo"
				target="_black"> Servlet Attribute Demo</a>
		</div>

		<!-- Request Dispatcher  Demo  -->
		<div class="divMarginTop">
			<label><b>6.</b></label><a
				href="${pageContext.request.contextPath}/requestDispacherDemo"
				target="_black"> Request Dispatcher Demo</a>
		</div>
		
		<!-- Send Redirect  Demo  -->
		<div class="divMarginTop">
			<label><b>7.</b></label><a
				href="${pageContext.request.contextPath}/sendRedirectDemo"
				target="_black"> Send Redirect Demo</a>
		</div>
	</div>
	
	<!-- Servlet Session Demo List  -->
	<div align="left"><h3>Servlet Session Demo</h3></div>
	<div>
	
		<!-- Hidden Form Field Demo  -->
			<div class="divMarginTop">
				<label><b>1.</b></label><a
					href="${pageContext.request.contextPath}/pages/jsp/hiddenFieldSession.jsp"
					target="_black"> Hidden Form Field</a>
			</div>
			
		<!-- URL Rewriting Demo  -->
			<div class="divMarginTop">
				<label><b>2.</b></label><a
					href="${pageContext.request.contextPath}/pages/jsp/urlRewritingSession.jsp"
					target="_black"> URL Rewriting</a>
			</div>
			
		<!-- Cookies Session Demo  -->
			<div class="divMarginTop">
				<label><b>3.</b></label><a
					href="${pageContext.request.contextPath}/cookiesDemo"
					target="_black"> Cookies</a>
			</div>
			
		<!-- Http Session Demo  -->
			<div class="divMarginTop">
				<label><b>4.</b></label><a
					href="${pageContext.request.contextPath}/httpSessionDemo"
					target="_black"> HttpSession</a>
			</div>
	
	</div>
	
	<div align="center">
		<h2>Index For JSP Demo</h2>
	</div>
	
	<!-- JSP Demo List  -->
	<div>

		<div class="divMarginTop">
			<label><b>1.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/scriptetJspDemo.jsp'
				target="_black"> Scriptet Demo</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>2.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/implicitObjectDemo.jsp'
				target="_black"> Implicit Object Demo</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>3.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/pageDirective.jsp'
				target="_black"> @Page Directive Demo</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>4.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/includeDirective.jsp'
				target="_black"> @Include Directive Demo</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>5.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/jspForward.jsp'
				target="_black"> Jsp:Forward</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>6.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/jspInclude.jsp'
				target="_black"> Jsp:Include</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>7.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/jspUseBean.jsp'
				target="_black"> Jsp : Use Bean</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>8.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/jspUseBeanSetGetProperty.jsp'
				target="_black"> Jsp : Use Bean (Set Property & Get Property)</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>9.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/jspJslt.jsp'
				target="_black"> Jsp : JSTL</a>
		</div>
		
		<div class="divMarginTop">
			<label><b>10.</b></label><a
				href='${pageContext.request.contextPath}/pages/jsp/demo/jspJsltCustome.jsp'
				target="_black"> Jsp : Custome JSTL Tag</a>
		</div>
		
	</div>
	
	
</body>
</html>