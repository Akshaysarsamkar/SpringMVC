<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>order</title>
</head>
<body>
	<h1>order page</h1>
	<form  action="check" method="post">
		<h1>Take order</h1>
		<div>
			order item: <input type="text" name="oi">
		</div>

		<br>
		<div>
			order place: <input type="text" name="op">
		</div>
		<br>
		<div>
			order date: <input type="date" name="odate">
		</div>
		<br>
		<div>
			<button type="submit">order</button>
		</div>

	</form>
</body>
</html>