<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<div class="container mx-auto mt-5 text-center">
		<h3>You have visited <a href=>http://your_session/</a> <c:out value="${count}"/> times.</h3>
		<a href="/">Try another visit?</a>
	</div>
	
<script type="text/javascript" src="js/app.js"></script>
</body>
</html>