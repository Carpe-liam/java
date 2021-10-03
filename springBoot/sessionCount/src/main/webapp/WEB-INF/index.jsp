<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic Page</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="container mx-auto mt-5 text-center">
		<h1>Welcome User!</h1>
		<h4>count: <c:out value="${count}" /> </h4>
		<div class=text-center>
			<a class="btn btn-dark my-2" href="/counter">Counter</a>
		</div>
		<div class=text-center>
			<a class="btn btn-dark my-2" href="/countTwo">Count +2</a>
		</div>
		<div class=text-center>
			<a class="btn btn-danger my-2" href="/reset">Reset</a>
		</div>
	</div>
	
<script type="text/javascript" src="js/app.js"></script>
</body>
</html>