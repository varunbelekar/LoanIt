<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
<h3>Welcome Registration Successfully.</h3>
<table>
	<tr>
		<td>User Name :</td>
		<td><core:out value="${registration.userName}" /></td>
	</tr>
	<tr>
		<td>Password :</td>
		<td><core:out value="${registration.password}" /></td>
	</tr>
</table>
<br/>
	<br/>
<br/>
	<a href="index.html">Home Page</a>
</body>
</html>