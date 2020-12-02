<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock">
<link rel="stylesheet" type="text/css" href= "css/styles.css">

<title>Date</title>
</head>
<body>
	
	<div class="container">
		<fieldset>
		<legend>Today's Date</legend>
		<c:set var = "now" value = "${date}" />
		<h3 id="date"><fmt:formatDate pattern = "EEEEEE, 'the' dd 'of' MMMM, yyyy"  value = "${now}"/></h3>
		<a href="/">Back</a>
		</fieldset>
	</div>
	
<script type="text/javascript" src="/js/dateAlert.js"></script>	
</body>
</html>