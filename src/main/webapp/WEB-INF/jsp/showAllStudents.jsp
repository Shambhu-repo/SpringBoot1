<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Students</title>
</head>
<body>
	
	<%@ include file="header.jspf" %>
	<div class="container">
		<div class="text-center">
			<h1>All Student Page</h1>
		</div>
		<c:if test="${message ne null }">  <!-- ne -not equal , eq->equal -->
			<div class="alert alert-success">
				<strong>${message}</strong>
			</div>
		</c:if>
		<table class="table table-bordered table-hover">
			<thead class="thead-light">
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Mobile</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach items="${studentList}" var="student">
					<tr>
						<td>${student.name }</td>
						<td>${student.email }</td>
						<td>${student.address }</td>
						<td>${student.mobile}</td>
						<td>
							<a href="studentDetail?studentid=${student.studentId}">studentDetail</a>
							<a href="deleteStudent?studentId=${student.studentId}"><img src="img/delete.png" style="height:40px"/></a>
							<a href="updateStudent?studentId=${student.studentId}"><img src="img/edit.png" style="height:40px"/></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>