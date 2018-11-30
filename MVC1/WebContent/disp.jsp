<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<%
	
	out.println(session.getAttribute("regno"));
	out.println(session.getAttribute("name"));
	out.println(session.getAttribute("marks1"));
	out.println(session.getAttribute("marks2"));
	out.println(session.getAttribute("marks3"));
	out.println(session.getAttribute("avg"));
	
	
	
	
	
	
	%>
</body>
</html>