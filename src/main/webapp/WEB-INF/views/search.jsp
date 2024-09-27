<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<title>Search Page</title>
</head>
<body>


	<div class="card m-5 bg-primary border border-dark">
		<div
			class="card-header text-center border border-dark font-weight-bold">Search
			Keyword</div>
		<div class="card-body font-weight-bold">
			<form action="searchdata" method="post">
				<div class="form-group font-weight-bold">
					<input type="text" class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" name="query"
						placeholder="Enter the keyword">
				</div>
		</div>
		<div class="text-center mb-2">
			<button type="submit"
				class="btn btn-outline-btn-outline-primary border border-dark "
				style="width: 20%;">Search</button>
		</div>
		</form>
	</div>


	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>


</body>
</html>