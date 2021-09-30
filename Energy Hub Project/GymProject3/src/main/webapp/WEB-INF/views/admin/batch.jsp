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
		<h1 class="text-center">Batches Details</h1>


		<a class="btn btn-primary btn-block " style="width: 150px"
			href="/admin/batchForm">Add Batch</a><br />

		<table id="example" class="table table-bordered "
			>
			<tr>
				<th>Batch Time</th>
				<th>Day</th>
				<th>Type</th>
				<th>Trainer</th>
				<th>Branch</th>
				<th>Action</th>
			</tr>

			<c:forEach var="batches" items="${requestScope.batch_details}">

				<tr>
					<td>${batches.batchTime}</td>
					<td>${batches.day}</td>
					<td>${batches.type}</td>
					<%-- <td>${batches.allocatedTrainer.id}</td>
				<td>${batches.branchEnrolled.id}</td> --%>

					<td>${batches.allocatedTrainer.firstName}<%-- ${batches.allocatedTrainer.lastName} --%></td>
					<td>${batches.branchEnrolled.branchName }</td>

					<td><a class="btn btn-primary btn-block " style="width: 100px"
						href="<spring:url value='/admin/updateBatchForm?batch_id=${batches.id} '/>">Edit</a>
						<a class="btn btn-primary btn-block " style="width: 100px"
						href="<spring:url value='/admin/deleteBatch?batch_id=${batches.id} '/>">Delete</a></td>


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