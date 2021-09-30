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

<script src="assets/js/dataTables.bootstrap4.min.js"></script>
<link href="assets/css/dataTables.bootstrap4.min.css" rel="stylesheet">



<style>
.login-form {
	width: 340px;
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
	<div class="container">
		<br />
		<h1 class="text-center">Package Details</h1>


		<a class="btn btn-primary btn-block " style="width: 150px"
			href="/admin/packageForm">Add Package</a><br />
			
	
	<table id="example" class="table table-bordered ">
		<tr>
			<th>Package Name</th>
			<th>Amount</th>
			<th>Duration</th>
<th>Action</th>
		</tr>
		

		<c:forEach var="packages1" items="${requestScope.package_details}">

			<tr>
				<td>${packages1.packageName}</td>
				<td>${packages1.amount}</td>
				<td>${packages1.duration}</td>

				<td><a class="btn btn-primary btn-block " style="width: 150px"
					href="<spring:url value='/admin/updatePackageForm?package_id=${packages1.id} '/>">Edit</a>

				<a class="btn btn-primary btn-block " style="width: 150px"
					href="<spring:url value='/admin/deletePackage?package_id=${packages1.id} '/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<script>
		$(document).ready(function() {
			$('#example').DataTable();
		});
	</script>


	<!-- Template Main JS File -->
	<script src="assets/js/main.js"></script>
	<script src="assets/js/jquery-3.6.0.min.js"></script>
	<script src="assets/js/jquery.validate.js"></script>
	<script src="assets/js/jquery.dataTables.min.js"></script>
	<script src="assets/js/dataTables.bootstrap4.min.js"></script>
	
	
	<a class="btn btn-primary btn-block " style="width: 100px" href="/user/logout">Logout</a>
</body>

</html>