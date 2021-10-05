<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<title>PokeBook Home</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>

<div class="container mx-auto mt-3 col-6 ">
	<h1> PokeBook </h1>
	
	
	<table class="table table-light table-striped text-center ">
		<thead>
		<tr>
			<th scope="row">Expense</th>
			<th scope="row">Vendor</th>
			<th scope="row">Amount</th>
			<th scope="row">Actions</th>
			
		</tr>
		</thead>
		<tbody>
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td> <a href="/expenses/${expense.id}">${expense.name}</a>	</td>
				<td>  ${expense.vendor} </td>
				<td>  ${expense.amount}	</td>
				<td> <a href="/expense/${expense.id}/edit">Edit</a> </td>
				<td>
					<form action="/delete/${expense.id}" method="post">
						<input type="hidden" name="_method" value="Delete"/>
						<input class="btn btn-danger" type="submit" value="Delete" />
					</form>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<div>
		<h2>Track an Expense:</h2>
	</div>
	
		
	<form:form action="/new_expense" method="post" modelAttribute="expense">
	    <p>
	        <form:label path="name">Expense:</form:label>
	        <form:errors class="text-danger" path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="vendor">Vendor:</form:label>
	        <form:errors class="text-danger" path="vendor"/>
	        <form:input path="vendor"/>
	    </p>
	    <p>
	        <form:label path="amount">Amount:</form:label>
	        <form:errors class="text-danger" path="amount"/>     
	        <form:input path="amount"/>
	    </p>    
   	    <p>
	        <form:label path="description">Description:</form:label>
	        <form:errors class="text-danger" path="description"/>
	        <form:textarea path="description"/>
	    </p>
	    <input type="submit" value="Submit"/>
	</form:form>    
	
	
	
	
</div>


</body>
</html>