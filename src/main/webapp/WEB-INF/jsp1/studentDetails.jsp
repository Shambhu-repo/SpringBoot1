<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<%@ include file="header.jspf" %>
		<div class="text-center">
			<h1>Student Detail Page</h1>
		</div>
	<div class="container">
		<div class="row">
			<div class="col-md-3">Student Name</div>
			<div class="col-md-9">${student.name }</div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-3">Student Email</div>
			<div class="col-md-9">${student.email }</div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-3">Address</div>
			<div class="col-md-9">${student.address }</div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-3">Mobile</div>
			<div class="col-md-9">${student.mobile }</div>
		</div>
	</div>
</body>
</html>