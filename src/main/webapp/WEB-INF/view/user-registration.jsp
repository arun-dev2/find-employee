<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign in</title>
</head>
<body>
	<h1 align="center">Please Register Here</h1>
	<hr>
	<form:form align="center" action="registrationSuccess"
		modelAttribute="userRegistration">
		
		<label for="name">Name : </label>
		<form:input id="name" type="text" path="name" />
		<br />
		
		<label for="gender">Gender : </label>
		Male<form:radiobutton id="gender" path="gender" value="male" />
		Female<form:radiobutton id="gender" path="gender" value="female" />
		<br />
		
		<label for="username">UserName : </label>
		<form:input id="username" type="text" path="userName" />
		<br />

		<label for="password">Password : </label>
		<form:input id="password" type="password" path="password" />
		<br />

		<label for="country">Country : </label>
		<form:select path="country">
			<form:option value="Ind" label="India"></form:option>
			<form:option value="Sin" label="Singapore"></form:option>
			<form:option value="Pak" label="Pakistan"></form:option>
			<form:option value="SL" label="SriLanka"></form:option>
		</form:select>
		<br />
		
		<label for="Skill">Skill : </label>
		Java : <form:checkbox path="Skill" value="java" />
		Docker : <form:checkbox path="Skill" value="docker" />
		SQL : <form:checkbox path="Skill" value="sql" />
		SpringFramework : <form:checkbox path="Skill" value="springframework" />
		<br />

		<input type="submit" value="Register">
	</form:form>

</body>
</html>