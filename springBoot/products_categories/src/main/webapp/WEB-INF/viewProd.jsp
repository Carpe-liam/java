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
    <title>${product.name} View</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container col-8 mx-auto">
   
   <h1>${product.name} </h1>
	<a href="/products">Home</a>
	
	<div class="main d-flex justify-content-between">
		<div>
			<h5>Categories:</h5>
			<c:forEach var="category" items="${product.categories}">
				<p>-${category.name}</p>
			</c:forEach>			
		</div>
		<div>
			<h5>Add Category:</h5>
			<form action="/add_category/${product.id}" method="post">
				<select name="category_id">
					<c:forEach var="cate" items="${categories}">
					<option value="${cate.id}">
							${cate.name}</option>
					</c:forEach>
				</select>
				<div>
					<input type="submit" value="Submit"/>
				</div>
			</form>
		</div>
	</div>
	
	
   
</div>
</body>
</html>