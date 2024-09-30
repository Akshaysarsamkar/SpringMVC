<%@page import="org.springframework.http.HttpRequest"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<title>Add Notes</title>
</head>
<body style="background-color: #f8f8ff;">
	<div class="container mt-5">
		<div class="card p-3 container" style="background-color: #ffffff;">
			<form action="${pageContext.request.contextPath}/showNotes"
				method="post">
				<h1 class="text-center">Update Product</h1>
				<input type="number" class="form-control" id="example"
					aria-describedby="emailHelp" name="id" value="${ up.id }" hidden>

				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Product
						Name</label> <input type="text" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp" name="name"
						value="${ up.name }">

				</div>
				<div class="mb-3">
					<label for="exampleInput" class="form-label">prize</label> <input
						type="number" class="form-control" id="exampleInput"
						aria-describedby="emailHelp" name="prize" value="${up.prize }" required>
				</div>
				<div class="form-group">
					<label for="exampleFormControlTextarea1">Example textarea</label>
					<textarea class="form-control" id="exampleFormControlTextarea1"
						rows="3" name="product_des">${up.product_des}</textarea>
				</div>
				<div class="text-center">
					<button type="submit" class="btn btn-primary btn-lg">Add</button>
					<a href="${ pageContext.request.contextPath  }/"
						class="btn btn-outline-danger  btn-lg mr-3">Back</a>
				</div>
			</form>
		</div>
	</div>


	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>


</body>
</html>