<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form:form method="Post" action="registrationform.html"
	commandName="registration">
	<table>
		<tr>
			<td>User Id:<FONT color="red"><form:errors
				path="id" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td>User Name:<FONT color="red"><form:errors
				path="userName" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="userName" /></td>
		</tr>

		<tr>
			<td>Password:<FONT color="red"><form:errors
				path="password" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="password" /></td>
		</tr>

		<tr>
			<td>Confirm Password:<FONT color="red"><form:errors
				path="confirmPassword" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="confirmPassword" /></td>
		</tr>

		<tr>
			<td>Email:<FONT color="red"><form:errors path="email" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>