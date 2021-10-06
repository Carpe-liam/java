<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert text here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body class="bg-dark text-light">
<div class="container">
	<nav>
		<h1>Dorms</h1>
	</nav>
	
	<div>
		<h2>Create Dorm</h2>
		<form:form action="/dorms/new" method="post" modelAttribute="dorm">
			<form:label path="name">Name:</form:label>
			<form:errors class="text-danger" path="name"/>
			<form:input path="name"/>
			<div>
				<input type="submit" value="Create" />
			</div>
		</form:form>
	</div>
	
	<div class="text-center col-6 mx-auto">
	<table class="table table-light">
		<thead>
			<tr>
				<th scope="row"> Dorm </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dorm" items="${dorms}">
				<tr>
					<td> <a href="/dorm/view/${dorm.id}">${dorm.name}</a> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>


</div>
</body>
</html>