<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hopper's Receipt</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body class="bg-primary">

	<h3><b>Customer's Name:</b> <c:out value="${name}"/> </h3>
	<p><b>Item's Name:</b> <c:out value="${itemName}" /> </p>
	<p><b>Price:</b> $<c:out value="${price}"/></p>
	<p><b>Descriptions:</b> <c:out value="${description}" /> </p>
	<p><b>Vendor:</b>: <c:out value="${vendor}" /> </p>	
	
	
<script type="text/javascript" src="js/app.js"></script>
</body>
</html>