<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><br>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
    <h1>Hello World</h1>
    
    <% for (int i=0; i<5; i++) { %>
    	<h4>Welcome to the world!</h1>
    	<p><%= i %></p>
    <% } %>
    
    <h4>The time is: <%= new Date() %></h4>
    
    
</body>
</html>