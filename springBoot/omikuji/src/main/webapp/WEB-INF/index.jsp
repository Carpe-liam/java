<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send an Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body class="bg-dark">

<div class="container mx-auto col-6">
	<header class="ht-4 text-light text-center">
		<h1>Send an Omikuji!!</h1>
	</header>

	<div class="p-4 m-2 bg-warning rounded">
		<form action="/sentInfo" method="post">
			<div class="m-2">
				<label for="years">Pick a number from 3-25:</label>
				<div>
					<input type="number" name="years" id="years" />
				</div>
			</div>
			<div class="m-2">
				<label for="city">Enter a city name:</label>
				<div>
					<input type="text" name="city" id="city" />
				</div>
			</div>
			<div class="m-2">
				<label for="person">Enter name of any real person:</label>
				<div>
					<input type="text" name="person" id="person" />
				</div>
			</div>
			<div class="m-2">
				<label for="hobby">Enter a professional endeavor or hobby:</label>
				<div>
					<input type="text" name="hobby" id="hobby" />
				</div>
			</div>
			<div class="m-2">
				<label for="liveThing">Enter any type of living thing.</label>
				<div>
					<input type="text" name="liveThing" id="liveThing" />
				</div>
			</div>
			<div class="m-2">
				<label for="niceSay">Say something nice to someone:</label>
				<div>
					<textarea name="niceSay" id="niceSay" cols="30" rows="4"></textarea>
				</div>
			</div>
			<div class="text-center">
				<button type="submit" class="btn btn-dark">Submit</button>
			</div>
		</form>
	</div>





</div>
	
<script type="text/javascript" src="js/app.js"></script>
</body>
</html>