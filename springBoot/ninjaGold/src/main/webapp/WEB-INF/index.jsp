<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold Game</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<div class="container">
	<div class="d-flex my-3">
		<div>
			<h2>Your Gold: </h2>
		</div>
		<div class="border bg-dark text-warning border-warning text-center col-1 ms-2">
			<h2><c:out value="${ninjaGold}"/></h2>
		</div>
	</div>
	<div class="m-2">
		<h1 class="text-danger text-center ms-3"><b> <c:out value="${loser}" /> </b></h1>
	</div>
	<div class="sites d-flex justify-content-around mt-4 ">
		<div class="border border-dark rounded p-3">
			<form action="/farm" method="POST">
				<h4>Farm</h4>
				<p>(earns 10-20 gold)</p>
				<button class="btn btn-primary">Find Gold!</button>
			</form>
		</div>
		<div class="border border-dark rounded p-3">
			<form action="/cave" method="POST">
				<h4>Cave</h4>
				<p>(earns 5-10 gold)</p>
				<button class="btn btn-primary">Find Gold!</button>
			</form>
		</div>
		<div class="border border-dark rounded p-3">
			<form action="/house" method="POST">
				<h4>House</h4>
				<p>(earns 2-5 gold)</p>
				<button class="btn btn-primary">Find Gold!</button>
			</form>
		</div>
		<div class="border border-dark rounded p-3">
			<form action="/casino" method="POST">
				<h4>Casino</h4>
				<p>(earns/takes 0-50 gold)</p>
				<button class="btn btn-primary">Find Gold!</button>
			</form>
		</div>
	</div>
	<div class="text-center my-3">
		<h1>Activities</h1>
		<hr/>
		<div class="mx-auto overflow-auto text-center border border dark rounded" style="width:600px; height:150px;">
			<c:forEach var="activity" items="${activityList}">
				<p> <c:out value="${activity.name}"/></p>
			</c:forEach>
		</div>
	</div>
	<div class="text-center">
		<a class="btn btn-danger" href="/reset">Reset</a>
	</div>


</div>
	
<script type="text/javascript" src="js/app.js"></script>
</body>
</html>