<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--Form will be submitted to the def action /user/login --%>
	<h5>${requestScope.message}</h5>
	<form method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter User Name</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>

</body>
</html>