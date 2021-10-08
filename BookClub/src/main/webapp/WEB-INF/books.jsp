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
	
		<nav class="p-3" style="font-family: cursive;">
			<div class="d-flex justify-content-between">
				<h1 style="color: rebeccapurple;"> <b>Welcome, ${user.username}</b></h1>
				<div>
					<a class="btn btn-danger" href="/logout">Logout</a>
				</div>
			</div>
			<div class="d-flex justify-content-between my-2">
				<p>Books from everyone's shelves:</p>	
				<a href="/books/new"> + Add a book to my shelf!</a>
			</div>
			<hr />
		</nav>
   
   <div>
	<table class="table table-light table-striped text-center ">
		<thead>
		<tr>
			<th scope="row">ID</th>
			<th scope="row">Title</th>
			<th scope="row">Author</th>
			<th scope="row">Posted By</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>  ${book.id} 		</td>
				<td> <a href="/books/${book.id}">${book.title}</a> </td>
				<td>  ${book.author}	</td>
				<td>  ${book.user.username}  </td> 
			</tr>
		</c:forEach>
		</tbody>
	</table>
   

   
   
   
   </div>
   
   
   
   
   
   </div>
</body>
</html>