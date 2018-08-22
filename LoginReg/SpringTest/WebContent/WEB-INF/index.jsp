<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

</head>
<body>

	
	<form id="form" method="post" action="login">
		<div class="container">
			<label for="email"><b>Email</b></label> <input type="text"
				placeholder="Enter Username" name="email" autocomplete="off"> <label
				for="password"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required>

			<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>

		<div class="container" >
			<span class="right"> <a href="register.jsp">Already Registered?</a></span>
			<span class="psw"> <a href="#">Forgot password?</a></span>
		</div>
	</form>
	
</body>
</html>