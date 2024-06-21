<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="process" method="get" modelAttribute = "userInfo">
		<div align = "center">
			<h1 align=center>Find Employee</h1>
			<hr/>
			<p><label for="role">Job Role:</label> <form:input type="textArea" id="role" path = "roleName"  /></p>
			<p><label for="name">Candidate Name:</label> <form:input type="textArea"id="name" path = "candidateName" /></p>
			<input type="submit" value="Calculate" />
		</div>
	</form:form>
</body>
</html>