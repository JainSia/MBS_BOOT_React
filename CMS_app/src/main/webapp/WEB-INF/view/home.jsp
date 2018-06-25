<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DAMS-Home Page</title>

<%-- Spring link preparation --%>
<s:url var="url_bootstrap" value="/static/css/bootstrap.min.css" />
<s:url var="url_navbar" value="/static/css/sticky-footer-navbar.css" />
<%-- <s:url var="url_font_awesome" value="/static/css/font-awesome.min.css" /> --%>

<link href="${url_bootstrap}" type="text/css" rel="stylesheet">
<link href="${url_navbar}" type="text/css" rel="stylesheet">

<%-- <link href="${url_font_awesome}" type="text/css" rel="stylesheet"> --%>
</head>
<body>
	<div class="container">
	<%@include file="common/header.jsp" %>
<!-- Main -->
 <%@include file="common/main.jsp" %>	
    <!-- footer -->
   <%@include file="common/footer.jsp" %>

    
	
		
	</div>
</body>
</html>