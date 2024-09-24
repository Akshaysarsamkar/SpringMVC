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
	<p>${ extra }</p>
	<h1>Student First Name : ${ student.firstname }</h1>
	<h1>Student Last Name : ${ student.lastname }</h1>
	<h1>class : ${ student.classname }</h1>
</body>
</html>