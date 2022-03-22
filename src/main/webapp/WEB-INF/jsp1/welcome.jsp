<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title></title>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>
  <script type="text/javascript">
	
	$(document).ready( function () {
	    $('#studentList').DataTable();
	} );
</script>
</head>
<body>

<form action="/"></form>
	<div class="container">
	<img src="img/school.jpg"/>
	<Strong>Harvard University</Strong><br>
	
	<strong>
Welcome to Our Portal
	 	 </strong>
<span style="margin-left: 5em;">
    	 	 <%= (new java.util.Date()).toLocaleString()%>
</span>

	 
	<nav class="navbar navbar-expand bg-warning navbar-default">
			  <!-- Links -->
			  <ul class="navbar-nav">
			  
			  	<li class="nav-item">
				      <a class="nav-link" href="register"><strong>Register</strong></a>
				    </li>
							
							<li class="nav-item">
						      <a class="nav-link" href="login"><strong>Login</strong></a>
						    </li>
				    
			  </ul>
		</nav>
		</div>
</body>
</html>