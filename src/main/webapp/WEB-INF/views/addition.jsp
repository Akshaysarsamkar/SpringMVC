<%@page import="Springmvc.Entity.Cource"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition page</title>
</head>
<body>
	<h1>add page</h1>
	<%
	String language = (String) request.getAttribute("language");
	Cource c = (Cource) request.getAttribute("c1");
	%>
	<h1 style="text-align: center; color: red; background-color: black;">
		Used language is:
		<%=language%></h1>
	<h1>
		<%=c.getCourceid()%>
	</h1>
	<h1>
		<%=c.getCourcename()%>
	</h1>

	<h1>
		<%=c.getFee()%>
	</h1>

</body>
</html>