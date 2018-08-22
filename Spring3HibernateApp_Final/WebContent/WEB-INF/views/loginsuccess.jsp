<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success</title>
</head>
<body>
<h3>Welcome <c:out value="${loginForm.userName}" /></h3>
<table>
	<tr>
		<td><a href="loginform.html">Back</a></td>
	</tr>
</table>
<br/>
<br/>
<h2>1. <a href="employees.html">List of Employees</a></h2>
<h2>2. <a href="add.html">Add Employee</a></h2>
</body>
</html>