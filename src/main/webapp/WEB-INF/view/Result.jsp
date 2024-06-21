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
	<h1 align=center>Find Employee</h1>
	<hr />
	<form:form modelAttribute = "userInfo">
	<p>Result</P>
	<p>Candidate ${userInfo.candidateName} profile matches for the ${userInfo.roleName} role.</p>
	</form:form>
</body>
</html>