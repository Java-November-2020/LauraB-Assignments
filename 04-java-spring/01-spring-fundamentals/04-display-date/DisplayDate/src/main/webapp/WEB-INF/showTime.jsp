<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href= "css/styles.css">
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock">
<title>Time</title>
</head>
<body>

	<div class="container">
		<fieldset>
		<legend>Current Time</legend>
		<c:set var = "now" value = "${time}" />
		<h3 id="time"><fmt:formatDate pattern = "hh:mm a" value = "${now}" /></h3>
		<a href="/">Back</a>
		</fieldset>
	</div>

<script type="text/javascript" src="/js/timeAlert.js"></script>	
</body>
</html>