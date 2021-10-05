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
		<div class="nav d-flex justify-content-between">
			<h1>Edit ${language.name} Language</h1>
			<div>
				<a href="/languages">Go Back</a>
			</div>
		</div>

	<form:form action="/edit_language/${language.id}" method="put" modelAttribute="language">
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