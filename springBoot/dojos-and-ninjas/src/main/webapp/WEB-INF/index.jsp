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
    <title>Dojo Info</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">


	<nav class="mx-auto text-center bg-dark text-light d-flex justify-content-between p-2">
		<h1>Welcome!</h1>
		<div>
			<a class="btn btn-primary" href="/new_ninja">New Ninja</a>
		</div>
	</nav>
	
	<div class="mx-auto text-center p-2 m-3 bg-warning">
		<form:form action="/new_dojo" method="post" modelAttribute="dojo">
			<form:label path="name">Dojo Name:</form:label>
			<form:errors class="text-danger" path="name"/>
			<form:input path="name"/>
			<div class="mt-2">
				<input type="submit" value="Submit" class="btn btn-primary" />
			</div>
		</form:form>
	</div>
	
	
	
	<table class="table text-center">
		<thead>
		<tr>
			<th scope="row">Locations</th>
			<th scope="row">Actions</th>			
		</tr>
		</thead>
		<tbody>
		<c:forEach var="dojo" items="${dojos}">
			<tr>
				<td>${dojo.name}</td>
				<td> <a href="/dojo/view/${dojo.id}">See Ninjas</a> </td>
			</tr>
		</c:forEach>
		</tbody>
	</table>


</div>
</body>
</html>