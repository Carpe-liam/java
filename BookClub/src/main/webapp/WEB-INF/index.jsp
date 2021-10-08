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
<title>enter title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body style="font-family: sans-serif;">

	<nav class="bg-secondary text-light p-3" style="font-family: cursive;">
		<div style="margin-left: 120px;" >
			<h1 style="color: rebeccapurple;"> <b>Welcome to Book Club!</b></h1>
			<h3>A place for friends to share thoughts on books.</h3>
		</div>
	</nav>

   <div class="container d-flex justify-content-around mt-3">
   
   <div class="register mx-2 col-5">
          <form:form action="/register" method="post" modelAttribute="newUser">
        <div class="form-group my-2">
            <label>Username:</label>
            <form:input path="username" class="form-control" />
            <form:errors path="username" class="text-danger" />
        </div>
        <div class="form-group my-2">
            <label>Email:</label>
            <form:input path="email" class="form-control" />
            <form:errors path="email" class="text-danger" />
        </div>
        <div class="form-group my-2">
            <label>Password:</label>
            <form:password path="password" class="form-control" />
            <form:errors path="password" class="text-danger" />
        </div>
        <div class="form-group my-2">
            <label>Confirm Password:</label>
            <form:password path="confirm" class="form-control" />
            <form:errors path="confirm" class="text-danger" />
        </div>
        <input type="submit" value="Register" class="btn btn-primary" />
    </form:form>
   </div>
   

    
    <div class="login mx-2 col-5">
        <form:form action="/login" method="post" modelAttribute="newLogin">
        <div class="form-group my-2">
            <label>Email:</label>
            <form:input path="email" class="form-control" />
            <form:errors path="email" class="text-danger" />
        </div>
        <div class="form-group my-2">
            <label>Password:</label>
            <form:password path="password" class="form-control" />
            <form:errors path="password" class="text-danger" />
        </div>
        <input type="submit" value="Login" class="btn btn-success" />
    </form:form>
    </div>
    
    

   </div>
</body>
</html>