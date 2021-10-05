<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<title>${expense.name}</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>

<div class="container mx-auto col-6">
	<div class="d-flex justify-content-between mt-3">
		<h1>Expense Details</h1>
		<div>
			<a class="btn btn-primary" href="/expenses">Go Back</a>
		</div>
	</div>
	<hr />
	<div>
		<h5><b>Expense Name:</b> 		${expense.name}</h5>
		<h5><b>Expense Description:</b> ${expense.description }</h5>
		<h5><b>Vendor:</b> 				${expense.vendor}</h5>
		<h5><b>Amount Spent:</b> 		$${expense.amount}</h5>
	</div>




</div>

</body>
</html>