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
<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<div class="container mx-auto mt-5">
		<h3 class="text-success text-center mt-5"> <c:out value="${time}" /></h3>
	</div>
</body>
</html>