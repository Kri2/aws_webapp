<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
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
.vertical-align{display:flex;align-items:center; min-height:100vh;}
.inputField{min-width:200px;min-height: 40px;margin:2px;}
.innerBox{margin:auto;min-width:240px;}
.buttonStyle{margin:2px;}
@media screen and (max-width:600px){
	
	.innerBox{
		width:100%;
	}
	.buttonStyle{
		width:100%;
	}
	.inputField{
		width: 100%; height: 40px;
  		line-height: 40px; font-size: 17px;
	}
}
</style>
</head>
<body>
<div class="container vertical-align" style="margin:auto; width:100%;">
	<div class="innerBox">
		<h1 style="font-size:4vw;color:#D0D0D0;">Hi!</h1>
		<p>Type in temperature in Celsius</p>
		<form:form method="POST" modelAttribute="temperatureForm">
		<form:input type="text" path="temperatureC" cssClass="inputField"/><br />
		<input type="submit" value="calculate" class="btn btn-default buttonStyle" />
		<c:if test="${pageContext.request.method=='POST'}"><!-- without this shows error also on first load -->
			<!--  
			<form:errors path="temperatureC" cssClass="error" /><!-- can put it somewhere else, can use path="*" -->
			<form:errors path="*" cssClass="errorBlock" element="div" />
		</c:if>
</form:form>
</div>
</div><!-- container -->
<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>