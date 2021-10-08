<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dorm.name} Dorm</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container col-10 mx-auto">
	<nav class="d-flex justify-content-between mt-3">
		<h2>${dorm.name}</h2>
		<div>
			<a class="btn btn-primary" href="/dorms">Back</a>
		</div>
	</nav>
	
	<form action="/dorm/add_student" method="post" >
		<input type="hidden" name="dorm_id" value="${dorm.id}" />
		<select name="id">
		<c:forEach var="stu" items="${students}">
			<option value="${stu.id}">
				<c:out value="${stu.firstName}"/>
				<c:out value="${stu.lastName}"/>
			</option>
		</c:forEach>
		</select>
		<div>
			<input type="submit" value="Submit" />
		</div>
	</form>
	
	<div class="text-center col-6 mx-auto">
	<table class="table table-light">
		<thead>
			<tr>
				<th scope="row"> Students </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${dorm.students}">
				<tr>
					<td> ${student.firstName} </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	

</div>
</body>
</html>