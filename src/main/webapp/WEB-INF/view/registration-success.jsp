<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Detail</title>
</head>
<body>

	<h1 align="center">Registration Successful</h1>

	<form:form align="left" modelAttribute="userRegistration">
		<h2>Verify your details:</h2>
		<br />
		Name    : ${userRegistration.name} <br />
		Gender  : ${userRegistration.gender} <br />
		UserName: ${userRegistration.userName} <br />
		Password: ${userRegistration.password} <br />
		Country : ${userRegistration.country} <br />
		Skill   : 
		<c:forEach var="temp" items="${userRegistration.skill}">
		${temp}
		</c:forEach>
		<br/>
	</form:form>

</body>
</html>