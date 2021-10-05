<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<title>Edit Expense</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>

<div class="container mx-auto col-6 mt-3">

	<div class="d-flex justify-content-between">
		<h1> Edit Expense: </h1>
		<a href="/">Back</a>
	</div>


	<form:form action="/update/${expense.id}" method="put" modelAttribute="expense">
	    <form:input path="id" type="hidden" value="${expense.id}"/>
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