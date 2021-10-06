<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New Ninja</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

	<nav>
		<h2>New Ninja</h2>
		<a class="btn btn-primary" href="/dojos">Back</a>
	</nav>

	<div class="mx-auto text-center p-2 m-3 bg-warning">
		<form:form action="/create_ninja" method="post" modelAttribute="ninja">
			
			<form:label path="firstName">First Name:</form:label>
			<form:errors class="text-danger" path="firstName"/>
			<form:input path="firstName"/>
			
			<form:label path="lastName">Last Name:</form:label>
			<form:errors class="text-danger" path="lastName"/>
			<form:input path="lastName"/>
			
			<form:label path="age">Age:</form:label>
			<form:errors class="text-danger" path="age"/>
			<form:input path="age"/>
			
		    <form:select path="dojo">
		        <c:forEach var="oneDojo" items="${dojos}">
		            <!--- Each option VALUE is the id of the person --->
		            <form:option value="${oneDojo.id}" path="dojo">
		            <!--- This is what shows to the user as the option --->
		                <c:out value="${oneDojo.name}"/>
		            </form:option>
		        </c:forEach>
		    </form:select>
			<div class="mt-2">
				<input type="submit" value="Create" class="btn btn-primary" />
			
			</div>
		
		 </form:form>
	</div>



</div>
</body>
</html>