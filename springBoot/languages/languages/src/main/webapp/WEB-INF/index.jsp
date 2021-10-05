<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert text here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container mx-auto col-6 mt-3">
	<div class="text-center">
		<h1>Languages!</h1>
	</div>

	<table class="table table-warning table-striped my-4">
		<thead>
		<tr>
			<th scope="row">Name</th>
			<th scope="row">Creator</th>
			<th scope="row">Version</th>
			<th scope="row">Action</th>
		</tr>
		</thead>
		<tbody>
		
		<c:forEach var="lang" items="${languages}">
			<tr>
				<td><a href="/languages/${lang.id}">${lang.name}</a></td>
				<td>${lang.creator}</td>
				<td>${lang.version}</td>
				<td class="d-flex"><a class="btn btn-primary" href="/languages/edit/${lang.id}">Edit</a>
					<form class="ms-2" action="/delete/${lang.id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input class="btn btn-danger" type="submit" value="Delete">
					</form>
				</td>
			</tr>
		</c:forEach>		
		
		</tbody>
	</table>
	
	<form:form action="/new_language" method="post" modelAttribute="language">
		<p>
			<form:label path="name" >Language Name:</form:label>
			<form:errors class="text-danger" path="name"/>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="creator">Creator:</form:label>
			<form:errors class="text-danger" path="creator"/>
			<form:input path="creator"/>
		</p>
		<p>
			<form:label path="version" >Version Number:</form:label>
			<form:errors class="text-danger" path="version"/>
			<form:input path="version"/>
		</p>
		<input type="submit" value="Submit" />
	
	
	</form:form>

	


</div>
</body>
</html>