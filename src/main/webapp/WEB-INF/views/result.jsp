<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>result</title>
	<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>
		.vertical-align{display:flex;align-items:center; min-height:100vh;}
		.innerBox{margin:auto;min-width:240px;}
	</style>
</head>
<body>
<br />
<div class="container vertical-align">
<div class="innerBox">
	<p>This is your result temperature in Fahrenheit</p>
	<p>${temperatureResult}</p>
	<a class="btn btn-default" href="<c:url value="welcome"/>" >Back to Welcome page</a>
	<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</div>
</div>	
</body>
</html>