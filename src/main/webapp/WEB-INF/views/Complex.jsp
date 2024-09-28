<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<title>Complex Form</title>
</head>
<body style="background-color: #f8f8ff;">
	<div class="container mt-5">
		<div class="card p-3 container" style="background-color: #ffffff;">
			<form action="data1" method="post">
				<h1 class="text-center">Registration Form</h1>
				<p>
					<form:errors path="student1.*" />
				</p>
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Student
						Name </label> <input type="text" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp" name="name">
					<div id="emailHelp" class="form-text">We'll never share your
						email with anyone else.</div>
				</div>
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Student
						ID </label> <input type="text" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp" name="id">
					<div id="emailHelp" class="form-text"></div>
				</div>
				<div class="mb-3">
					<label for="exampleInputEmail1" class="form-label">Student
						DOB </label> <input type="text" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp" name="dob">
					<div id="emailHelp" class="form-text"></div>
				</div>
				<div class="mb-3">
					<label for="delect" class="form-label">Student Type </label><select
						class="form-select" aria-label="Default select example"
						id="delect" style="width: 100%; padding-left: 0px;" name="type">
						<option value="NormalStudent">Normal Student</option>
						<option value="NewStudent">New Student</option>
					</select>
				</div>
				<div class="	mb-3">
					Select Gender
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender"
							id="inlineRadio1" value="Male"> <label
							class="form-check-label" for="inlineRadio1">Male</label>
					</div>

					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender"
							id="inlineRadio2" value="female"> <label
							class="form-check-label" for="inlineRadio2">Female</label>
					</div>
				</div>
				<h1 class="mb-3">Address</h1>
				<div class="mb-3">
					<input type="text" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" name="address.city"
						placeholder="Enter the city name">
					<div id="emailHelp" class="form-text"></div>
				</div>

				<div class="mb-3">
					<input type="text" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" name="address.street"
						placeholder="Enter the Street Name">
					<div id="emailHelp" class="form-text"></div>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
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