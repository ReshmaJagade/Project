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
	<%--Spring tag url : URL rewriting n creating URLs relative to root of  curnt web ctx --%>
<%-- 	<spring:url var="url" value="/admin/addPackage" />--%>
<%--action="${url}" --%>


<div class="login-form">
	<form:form  method="post" modelAttribute="update_Batch">
	<h2 class="text-center">Update Batch</h2>
			<br />
			
	
		<div class="row align-items-start">
		
			<div class="col">Id</div>
	<div class="col"><form:input path="id" value="${requestScope.id}"/></div>
	</div>
	<br/>
		
		
		<div class="row align-items-start">

				<div class="col">Batch Time</div>
				<div class="col">
					<form:input path="batchTime" value="${requestScope.old_batch.batchTime}" required="required"/>
				</div>
			</div>

<br />

			<div class="row align-items-start">
				<div class="col">Day</div>
				<div class="col">

					<form:input path="day" value="${requestScope.old_batch.day}" required="required" />
				</div>
			</div>
			
			
<br />
			
			<div class="row align-items-start">
				<div class="col">Type</div>
				<div class="col">
					<form:input path="type" value="${requestScope.old_batch.type}" required="required"/>
				</div>
			</div>
			
<br />			



			<div class="row align-items-start">
				<div class="col">Select Trainer</div>
				<div class="col">

					<form:select path="allocatedTrainer">

						<form:options path="id" items="${requestScope.trainer_info}"
							itemLabel="firstName" itemValue="id" delimiter="<br/> " required="required"/>
					</form:select>
				</div>
			</div>

<br />

			<div class="row align-items-start">
				<div class="col">Select Branch</div>
				<div class="col">
					<form:select path="branchEnrolled">

						<form:options path="id" items="${requestScope.branch_info}"
							itemLabel="branchName" itemValue="id" delimiter="<br/> " required="required"/>
					</form:select>
				</div>
			</div>
			
<br />			
			
			<div class="row align-items-start">
				<button type="submit" class="btn btn-primary btn-block">Update
					Batch</button>
			</div>
	</form:form>
	</div>

</body>
</html>