<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
		<h2>Add Employee Data</h2>
		<form method="POST" action="save.html">
	   		<table>
			    <tr>
			        <td><label for="id">Employee ID:</label></td>
			        <td><input name="id" value="${employee.id}" placeholder="Enter Id" required /></td>
			    </tr>
			    <tr>
			        <td><label for="name">Employee Name:</label></td>
			        <td><input type = "text" name="name" value="${employee.name}" placeholder="Enter Name" required/></td>
			    </tr>
			    <tr>
			        <td><label for="age">Employee Age:</label></td>
			        <td><input type="number" name="age" value="${employee.age}" placeholder="Enter Age" required /></td>
			    </tr>
			    <tr>
			        <td><label for="salary">Employee Salary:</label></td>
			        <td><input type = "number" name="salary" value="${employee.salary}" placeholder="Enter Salary" required /></td>
			    </tr>
			    
			    <tr>
			        <td><label for="address">Employee Address:</label></td>
                    <td><input type = "text" name="address" value="${employee.address}" placeholder="Enter Address" required /></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form>
		
  <c:if test="${!empty employees}">
		<h2>List Employees</h2>
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Age</th>
			<th>Employee Salary</th>
			<th>Employee Address</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"/></td>
				<td><c:out value="${employee.name}"/></td>
				<td><c:out value="${employee.age}"/></td>
				<td><c:out value="${employee.salary}"/></td>
				<td><c:out value="${employee.address}"/></td>
				<td align="center"><a href="edit.html?id=${employee.id}">Edit</a> | <a href="delete.html?id=${employee.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<br/>
<br/>
	<a href="index.html">Home Page</a>
	</body>
</html>