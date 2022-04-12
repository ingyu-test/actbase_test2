<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		actbase_test_ingyu  
	</h1>
	
	<p>이름을 입력하세요</p>
	
	<form action="hello" method="get">
		<input type="text" name="name" />
		<input type="submit" value="제출">
	</form>

</body>
</html>
