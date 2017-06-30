<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to my page</title>
<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<style>
.error{
	color: #f49842;
	font-size: 0.8em;
}
.errorBlock{
	color: #f49842;
	font-size: 0.8em;
	padding: 8px;
}
</style>
</head>
<body>
<div class="container">
<h1>Hi!</h1>
<p>Type in temperature in Celsius</p>
<form:form method="POST" modelAttribute="temperatureForm">
	<form:input type="text" path="temperatureC" />
	<input type="submit" value="calculate" />
	<c:if test="${pageContext.request.method=='POST'}"><!-- without this shows error also on first load -->
		<!--  
		<form:errors path="temperatureC" cssClass="error" /><!-- can put it somewhere else, can use path="*" -->
		<form:errors path="*" cssClass="errorBlock" element="div" />
	</c:if>
</form:form>
<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</div><!-- container -->
</body>
</html>