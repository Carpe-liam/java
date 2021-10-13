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
    <title>Home</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container text-center">

	<h1>welcome to home</h1>
	<div class="col-3 mx-auto d-flex justify-content-between">
		<a class="btn btn-primary" href="/products/new">New Prod</a>
		<a class="btn btn-primary" href="/categories/new">New Category</a>
	</div>

<div class="main col-8 mt-3 mx-auto d-flex  justify-content-between">

<div>
<h3>Products</h3>
	<table class="table table-secondary table-striped text-center ">
		<thead>
		<tr>
			<th scope="row">ID</th>
			<th scope="row">Product Name</th>
			<th scope="row">Description</th>
			<th scope="row">Price</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>  ${product.id} 		</td>
				<td> <a href="/products/${product.id}">${product.name}</a> </td>
				<td>  ${product.description} 	</td>
				<td>  $ ${product.price}0  </td> 
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>

<div>
<h3>Categories</h3>
	<table class="table table-secondary table-striped text-center ">
		<thead>
		<tr>
			<th scope="row">ID</th>
			<th scope="row">Category Name</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="category" items="${categories}">
			<tr>
				<td>  ${category.id} 		</td>
				<td> <a href="/categories/${category.id}">${category.name}</a> </td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>


<!-- end main -->
</div>
<!-- end container -->
</div>
</body>
</html>