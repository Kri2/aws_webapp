<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hello World!</title>
<link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<style>
	.vertical-align{display:flex;align-items:center; min-height:100vh;}
	h2{font-size: 5vw;}
</style>
</head>
<body>
	<div class="container vertical-align text-align:center">
		<div style="margin-top:40px; padding-bottom:60px; text-align:center; display:inline-block;margin:auto">
			<h2 style="color: #D0D0D0;">Hello World!</h2><br />
			<a class="btn btn-default" style="min-width:240px; font-size:3vw; padding:10px 20px;" href="<c:url value="welcome"/>">Go to Temperature converter</a>
		</div>
	</div>
<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
