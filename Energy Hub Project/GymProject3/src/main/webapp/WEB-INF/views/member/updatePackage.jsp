<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag lib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--import Spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%-- import spring supplied form tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>The Energy Hub</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
.login-form {
	width: 420px;
	margin: 50px auto;
	font-size: 15px;
}

.login-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.login-form h2 {
	margin: 0 0 15px;
}

.form-control, .btn {
	min-height: 38px;
	border-radius: 2px;
}

.btn {
	font-size: 15px;
	font-weight: bold;
}
</style>
</head>
<body>
<div class="login-form">
<form:form  method="post" modelAttribute="update_Package">
			
		<div class="row align-items-start">
		<div class="col">Id</div>
		<div class="col">
		<form:input path="id" value="${requestScope.id}"/>
		</div>
		</div>
		<br/>
		
		<div class="row align-items-start">
		<div class="col">
		Select Package
		</div>
		<div class="col">
		<form:select path="selectedPackage">
						<form:options items="${requestScope.all_packages}"
							itemLabel="packageName" itemValue="id" delimiter="<br/> " required="required"/>
					</form:select>
					</div>
					</div>
					
					<br/>
					<div class="row align-items-start">


				<button type="submit" class="btn btn-primary btn-block">Update
					Package</button>
			</div>
			
	</form:form>
	</div>
</body>
</html>