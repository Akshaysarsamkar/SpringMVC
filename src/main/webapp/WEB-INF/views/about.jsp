<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${ title }</title>
</head>
<body>
	<h1>ABOUT PAGE</h1>
	<p>${ extra }</p>

	<h1 style="text-align: center;">Registration form</h1>
	<form action="senddata" method="post" style="text-align: center;">
		<div>
			First Name: <input type="text" placeholder="Enter the first name"
				name="firstname" required>
		</div>
		<br>
		<div>
			Last Name: <input type="text" placeholder="Enter the last name"
				name="lastname" required>
		</div>
		<br>

		<div>
			Standard <input type="number" placeholder="Enter the class name"
				name="classname" required>
		</div>
		<br>
		<div>
			<button type="submit">Signin</button>
		</div>
	</form>
</body>
</html>