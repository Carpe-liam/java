<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>
	<div class="container mx-auto col-6">
	
	
	<div id="title" class="text-center">
		<h1 >Fruity Loops Fruit Store!</h1>
	</div>
	
	<div>
		<table id="table" class="table table-striped">
		
		<thead>
			<tr>
				<th>Fruit Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="fruit" items="${fruitList}">
				<tr>
					<td> <c:out value="${fruit.name }" /> </td>
					<td> $<c:out value="${fruit.price}" /> </td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
	
	
<!-- end container -->
	</div>
</body>
</html> 