<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cafe Java</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container m-3 mx-auto">
		
		<nav class="d-flex justify-content-between">
			<h1>Welcome ${user.userName}</h1>
			<div>
				<a class="btn btn-danger" href="/logout">Logout</a>
			</div>
		</nav>
		
		<p>user id = ${user.id}</p>
		<p>user username = ${user.userName}</p>
		<p>user email = ${user.email }</p>
		
		

    </div>
</body>
</html>