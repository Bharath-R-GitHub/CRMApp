<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="#" method="post" modelAttribute="emp">
		<center>
			<table>
				<tr>
					<td>Eno</td>
					<td><f:input path="eno" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><f:input path="name" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><f:input path="address" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><f:input path="email" /></td>
				</tr>

			</table>
		</center>
		<br>
		<center>
			<input type="submit" value="Update" />
		</center>
	</f:form>
</body>
</html>