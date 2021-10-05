<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Reading Books</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>

<div></div>

<div class="container mx-auto mt-3">
	<h1>TEST!</h1>

<table class="table">
	<thead>
	<tr>
		<th scope="row">ID</th>
		<th scope="row">Title</th>
		<th scope="row">Language</th>
		<th scope="row"># of Pages</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach var="book" items="${books}">
			<tr>
				<td> <c:out value="${book.id}"/>	</td>
				<td>	<a href="/books/<c:out value="${book.id}"/>">	<c:out value="${book.title}"/>	</a>	</td>
				<td>  <c:out value="${book.language}"/>	</td>
				<td>  <c:out value="${book.numberOfPages}"/>	</td>
			</tr>
		</c:forEach>
	
	</tbody>
</table>
	
</div>

<div></div>

</body>
</html>