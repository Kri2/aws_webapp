<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result</title>
</head>
<body>
	<p>This is your result temperature in Fahrenheit</p>
	<p>${temperatureResult.temperatureF}</p>
	<a href="<c:url value="welcome"/>" >Back to Welcome page.</a>
	<p>Previous results</p>
	<c:forEach items="${previousResults}" var="item">${item.temperatureC} : ${item.temperatureF}<br /></c:forEach>
	
<!--  	
	<c:forEach items="${temperatureList}" var="item"> ${item.temperatureC} : ${item.temperatureF}<br /></c:forEach>
	<p>This is from Entity Manager: </p>
	<p>${temperatureFromEntityManager}</p> -->
	<p>THE END</p>
</body>
</html>