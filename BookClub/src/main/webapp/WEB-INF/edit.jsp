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
		<h2>Add a Book to Your Shelf </h2>
		<div>
			<a class="btn btn-primary" href="/books">Back to shelves</a>
		</div>
	</nav>

	<hr />
	<div class="col-8 mx-auto">
		<form:form action="/books/${book.id}/update" method="post" modelAttribute="book">
			<div class="form-group">
				<div>
					<label>Title: </label>
				</div>
				<div>
					<form:input path="title" class="form-control"/>
					<form:errors path="title" class="text-danger"/>
				</div>
			</div>
			<div class="form-group">
				<div>
					<label>Author: </label>
				</div>
				<div>
					<form:input path="author" class="form-control"/>
					<form:errors path="author" class="text-danger"/>
				</div>
			</div>
			<div class="form-group">
				<div>
					<label>Your thoughts: </label>	
				</div>
				<div>
					<form:textarea path="thought" class="form-control"/>
					<form:errors path="thought" class="text-danger"/>
				</div>
			</div>
			<div>
				<input type="submit" value="Submit" />
			</div>
		</form:form>
	</div>




</div>
</body>
</html>