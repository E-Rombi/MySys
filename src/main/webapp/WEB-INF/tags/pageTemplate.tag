<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>

<%@ attribute name="titulo" required="true" %>
<%@ attribute name="bodyClass" required="false" %>
<%@ attribute name="extraCss" fragment="true" %>

<c:url value="/resources/" var="contextPath" />

<!DOCTYPE html>
<html>

	<head>
		<jsp:invoke fragment="extraCss"></jsp:invoke>
		<link rel="stylesheet" href="${contextPath }css/bootstrap.css">
		<script src='http://code.jquery.com/jquery-2.1.3.min.js'></script>
		<script src="${contextPath }js/bootstrap.bundle.js" ></script>
		<script src="${contextPath }jquery-3.5.1.slim.min.js"></script>
		<script src="${contextPath }popper.min.js" ></script>
		<link rel="stylesheet" href="${contextPath }css/my.css">
		<link href="${contextPath }css/dashboard.css" rel="stylesheet"> 
		<link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
		<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
		
	</head>
	<body class="${bodyClass}">

	<%@ include file="/WEB-INF/views/includes/cabecalho.jsp" %>
	<%@ include file="/WEB-INF/views/includes/lateral.jsp" %>

	<jsp:doBody />

	<%@ include file="/WEB-INF/views/includes/rodape.jsp" %>
	
	</body>
</html>
