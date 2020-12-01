<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" type="text/css" href= "css/styles.css">
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>
	<div class="container">
		<h1>You have visited http://localhost:8080/ <c:out value=" ${count}"/> time(s)</h1>
		<h4>To test another visit --> <a href="/">Click here</a></h4>
		
		<div>
			<button>
				<a href="/reset">Reset the Counter</a>  <!--figure out the proper way to do a button-->
			</button>
		</div>
	</div>
	
	
</body>
</html>