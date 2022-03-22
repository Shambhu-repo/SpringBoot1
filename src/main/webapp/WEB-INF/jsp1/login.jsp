<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<%@ include file="header.jspf" %>
	<div class="container">
	<div class="text-center">
		<h1> Student Login Page</h1>
	</div>
	<c:if test="${message ne null }">  <!-- ne -not equal , eq->equal -->
		<div class="alert alert-success">
			<strong>${message }</strong>
		</div>
	</c:if>
	<form action="authentication" method="post">
		<div class="row">
			<div class="col-md-3">Student Email</div>
			<div class="col-md-9"><input type="text" name="email"/></div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-3">Password</div>
			<div class="col-md-9"><input type="password" name="password"/></div>
		</div>
		<button type="submit" class="btn btn-primary">Login</button>
	</form>
	
	</div>

</body>
</html>