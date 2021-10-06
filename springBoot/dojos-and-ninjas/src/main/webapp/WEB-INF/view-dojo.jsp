<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>enter title here</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

	<nav class="d-flex justify-content-between mt-3">
		<h2>Viewing ${dojo.name} Dojo</h2>
		<div>
			<a class="btn btn-primary" href="/dojos">Back</a>
		</div>
	</nav>


	<table class="table text-center">
		<thead>
		<tr>
			<th scope="row">First Name</th>
			<th scope="row">Last Name</th>
			<th scope="row">Age</th>				
		</tr>
		</thead>
		<tbody>
		<c:forEach var="ninja" items="${dojo.ninjas}">
			<tr>
				<td>${ninja.firstName}</td>
				<td>${ninja.lastName}</td>
				<td>${ninja.age}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>



</div>
</body>
</html>