<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
</head>
<body>
		<div class="container">
			<fieldset>
			<legend>Current Time</legend>
			<c:set var = "now" value = "${time}" />
			<h4><fmt:formatDate pattern = "hh:mm a" value = "${now}" /></h4>
			<a href="/">Back</a>
			</fieldset>
		</div>

</body>
</html>