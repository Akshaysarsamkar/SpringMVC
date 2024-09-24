<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact form</title>
</head>
<body>
	<h1>Contact page</h1>
	<form action="processdata" method="post">
		<div>
			Name: <input type="text" placeholder="Enter your name"
				name="firstname" required>
		</div>
		<br>
		<div>
			Number: <input type="number" placeholder="number" name="number" required>
		</div>
		<br>
		<div>
			<button type="submit">Submit</button>
		</div>
	</form>

	<h1>name ${ name }</h1>
	<h2>Number : ${ num }</h2> </body>
</html>