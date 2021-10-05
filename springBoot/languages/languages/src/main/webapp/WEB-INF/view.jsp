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
	<div class="container">
	
		<div class="nav d-flex justify-content-between">
			<h1>${language.name} Language</h1>
			<div>
				<a href="/languages">Go Back</a>
			</div>
		</div>
	
		<div class="d-flex justify-content-around">
			<div class="info">
				<p>	Name: ${langugage.name}</p>
				<p>	Creator: ${language.creator}</p>
				<p> Version: ${language.version}</p>
			</div>
			<div class="d-flex">
				<div>
					<a class="btn btn-primary" href="/languages/edit/${language.id}">Edit</a>
				</div>
				<form class="ms-2" action="/delete/${language.id}" method="post">
				    <input type="hidden" name="_method" value="delete">
				    <input class="btn btn-danger" type="submit" value="Delete">
				</form>
			</div>
		</div>
			
	</div>
</body>
</html>