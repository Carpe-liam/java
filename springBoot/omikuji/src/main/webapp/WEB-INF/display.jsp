<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body class="bg-dark">

<div class="container m-3 mx-auto">
	
	<header class="text-light text-center">
		<h1>Here's Your Omikuji</h1>
	</header>
<!-- this is the Omikuji -->
	<div class="bg-warning p-3 rounded col-5 mx-auto">
	<h3>
		In <c:out value="${years}"/> years, you will
		live in <c:out value="${city}" /> with
		<c:out value="${name}"/> as your roommate, 
		selling <c:out value="${hobby}"/> for a living.
		The next time you see a <c:out value="liveThing"/>, 
		you will have good luck. Also, <c:out value="${niceSay}"/>
	</h3>
	</div>
	



</div>
	
<script type="text/javascript" src="js/app.js"></script>
</body>
</html>