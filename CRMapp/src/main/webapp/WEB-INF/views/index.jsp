<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Eno</th>
			<th>Name</th>
			<th>Address</th>
			<th>Email</th>
		</tr>
		<b:forEach var="emp" items="${employees}">
			<b:url var="editLink" value="/edit">
				<b:param name="eno" value="${emp.eno}" />
			</b:url>
			<tr>
				<td>${emp.eno}</td>
				<td>${emp.name}</td>
				<td>${emp.address}</td>
				<td>${emp.email}</td>
				<td><a href="${editLink}">Edit</a></td>
				<td><a href="#">Delete</a></td>
			</tr>
		</b:forEach>
	</table>
</body>
</html>