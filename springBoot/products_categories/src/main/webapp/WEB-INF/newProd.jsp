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
    <title>Create Product</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

<h1> New Product</h1>

<div class="col-5 mx-auto">
	<form:form action="/create_product" method="post" modelAttribute="product">
		<div class="form-group">
			<label>Name:</label>
			<form:input path="name" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Description:</label>
			<form:textarea path="description" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Price:</label>
			<form:input path="price" class="form-control"/>
		</div>
		<div class="mx-auto text-center">
			<input class="btn btn-success mt-3" type="submit" value="+ Create"/>
		</div>
	</form:form>
</div>


</div>
</body>
</html>