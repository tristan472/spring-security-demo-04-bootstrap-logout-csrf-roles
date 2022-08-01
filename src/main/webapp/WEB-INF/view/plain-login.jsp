<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Custom Login Page</title>
	
	<style>
		.failed {
			color: red;
		}
	</style>
	
</head>
<body>
	<h3>My Custom Login Page</h3>
	

			   
			   <p>
			   		User name: <input type="text" name="username"/>
			   </p>
			   <p>
			   		Password: <input type="password" name="password"/>
			   </p>
			   
			   <input type="submit" value="Login"/>

	
</body>
</html>