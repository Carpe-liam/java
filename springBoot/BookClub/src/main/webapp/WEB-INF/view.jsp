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
	<nav class="d-flex justify-content-between p-3 bg-dark text-light">
		<h2 style="margin-left: 200px;">${book.title}</h2>
		<div>
			<a class="btn btn-primary" href="/books">Back to shelves</a>
		</div>
	</nav>
<div class="container">

	
	
	<div class="col-7 mx-auto border border-dark rounded p-3 m-2">
	
	<h3></h3>
	<h4> 
		<span class="text-danger"> ${book.user.username}   </span> read 
		<span style="color: rebeccapurple;"> ${book.title}  </span> by 
		<span style="color: green;"> ${book.author} </span>.  
	</h4>
	<h5>Here are ${book.getUser().getUsername()} 's thoughts: </h5>
	
	<c:if test="${book.borrower == 0}">
		${book.borrower}
	</c:if>
	
	<hr />
		<p>${book.thought}</p>

	<hr />
	<div class="d-flex justify-content-around">
		 <c:if test="${book.user.id == user.id}">
			<a class="btn btn-primary" href="/books/${book.id}/edit">Edit</a>	
			<form action="/books/${book.id}/delete" method="post" class="ms-2">
				<input type="hidden" name="_method" value="Delete"/>
				<input type="submit" class="btn btn-danger" value="Delete" />
			</form> 	
		 </c:if>
	</div>
	</div>


</div>
</body>
</html>