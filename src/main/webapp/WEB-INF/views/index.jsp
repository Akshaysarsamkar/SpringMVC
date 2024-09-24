<%@page import="java.util.List"%>
<%@page import="Springmvc.Entity.Cource"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stape to create Spring mvc project</title>
</head>
<body>
	<h1>Spring mvc project</h1>
	<%
	String name = (String) request.getAttribute("Name");

	Cource cource = (Cource) request.getAttribute("Courcename");

	List<String> list = (List<String>) request.getAttribute("allcources");
	%>

	<h1>
		Name of cource is:
		<%=name%>
	</h1>

	<h2>
		Cource id :
		<%=cource.getCourceid()%></h2>
	<h2>
		Cource Name :
		<%=cource.getCourcename()%></h2>

	<h2>
		Cource Fees :
		<%=cource.getFee()%></h2>

	<h1>access the collection</h1>
	<%
	for (String c : list) {
	%>
	<h3><%=c%></h3>
	<%
	}
	%>

</body>