<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="process" method="get">
		<div align = "center">
			<h1 align=center>Find Employee</h1>
			<hr/>
			<p><label for="role">Job Role:</label> <input type="text" id="role" name = "rname"  /></p>
			<p><label for="name">Candidate Name:</label> <input type="text"id="name" name = "cname" /></p>
			<input type="submit" value="Calculate" />
		</div>
	</form>
</body>
</html>