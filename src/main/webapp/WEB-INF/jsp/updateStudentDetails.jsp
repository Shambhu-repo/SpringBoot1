<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<%@ include file="header.jspf" %>
	<div class="container">
	<div class="text-center">
		<h1> Student Update Page</h1>
	</div>
	<c:if test="${message ne null }">  <!-- ne -not equal , eq->equal -->
		<div class="alert alert-success">
			<strong>${message }</strong>
		</div>
	</c:if>
	<form action="updateStudent" method="post">
		<input type="hidden" value="${student.studentId }" name="studentId"/>
		<div class="row">
			<div class="col-md-3">Student Name</div>
			<div class="col-md-9"><input type="text" value="${student.name }" name="studentName"/></div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-3">Student Email</div>
			<div class="col-md-9"><input type="text" value="${student.email }" name="email"/></div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-3">Password</div>
			<div class="col-md-9"><input type="password" value="${student.password }" name="password"/></div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-3">Address</div>
			<div class="col-md-9"><input type="text" value="${student.address }" name="address"/></div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-3">Mobile</div>
			<div class="col-md-9"><input type="text" value="${student.mobile }" name="mobile"/></div>
		</div>
		</br>
		<button type="submit" class="btn btn-primary">Update</button>
	</form>
	</div>
</body>
</html>