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
	<%-- 	<spring:url var="url" value="/admin/addTrainer" />--%>
	<%--action="${url}" --%>
	<div class="login-form">
		<form:form method="post" modelAttribute="update_Trainer">

			<h2 class="text-center">Update Trainer</h2>
			<br />
			<div class="row align-items-start">
				<div class="col">ID</div>
				<div class="col">
					<form:input path="id" value="${requestScope.id}" required="required"/>

				</div>
			</div>

			<br />

			<div class="row align-items-start">

				<div class="col">First Name</div>

				<div class="col">

					<form:input path="firstName" value="${requestScope.old_trainer.firstName}" required="required" />
				</div>

			</div>
			<br />
			<div class="row align-items-start">
				<div class="col">Last Name</div>
				<div class="col">
					<form:input path="lastName" value="${requestScope.old_trainer.lastName}" required="required"/>
				</div>
			</div>
			<br />

			<div class="row align-items-start">
				<div class="col">Address</div>
				<div class="col">
					<form:input path="address" value="${requestScope.old_trainer.address}" required="required" />
				</div>
			</div>
			<br />


			<div class="row align-items-start">
				<div class="col">Email Id</div>
				<div class="col">
					<form:input type="email" path="emailId" value="${requestScope.old_trainer.emailId}" required="required" />
				</div>
			</div>

			<br />
			<div class="row align-items-start">
				<div class="col">Gender</div>
				<div class="col">
					<form:radiobutton path="gender" value="Female" required="required"/>
					Female
					<form:radiobutton path="gender" value="Male" required="required" />
					Male
				</div>
			</div>

			<br />

			<div class="row align-items-start">
				<div class="col">Date Of Birth</div>
				<div class="col">
					<form:input type="date" path="dob" value="${requestScope.old_trainer.dob}" required="required"/>
				</div>
			</div>

			<br />

			<div class="row align-items-start">
				<div class="col">Mobile No</div>
				<div class="col">

					<form:input path="mobileNo" value="${requestScope.old_trainer.mobileNo}" required="required"/>
				</div>
			</div>
			<br />


			<div class="row align-items-start">
				<div class="col">User Name</div>
				<div class="col">
					<form:input path="userName" value="${requestScope.old_trainer.userName}" required="required"/>
				</div>
			</div>

			<br />
			<div class="row align-items-start">
				<div class="col">Password</div>
				<div class="col">
					<form:input path="password" type="password" value="${requestScope.old_trainer.password}" required="required" placeholder="Minimum 5 char" />
				</div>
			</div>
			<br />

			<div class="row align-items-start">
				<div class="col">Confirm Password</div>
				<div class="col">
					<form:input path="confirmPassword" type="password" value="${requestScope.old_trainer.confirmPassword}" required="required" placeholder="Minimum 5 char"  />
				</div>
			</div>
			<br />
			<div class="row align-items-start">
				<div class="col">Specialization</div>
				<div class="col">
					<form:input path="specialization" value="${requestScope.old_trainer.specialization}" required="required"/>
				</div>
			</div>
			<br />
			<div class="row align-items-start">
				<div class="col">Experience in Years</div>
				<div class="col">
					<form:input type="number" path="experience" value="${requestScope.old_trainer.experience}" required="required"/>
				</div>
			</div>
			<div class="row align-items-start">
			<script>
	  
			msg='<%=request.getAttribute("message")%>'
			if(msg!="null")
			alert("Password minimum length 5.Password and Confirm Password must be same");
			</script>
			
				
			</div>
			
			<br />
			<div class="row align-items-center">
				<button type="submit" class="btn btn-primary btn-block">Update
					Trainer</button>
			</div>
		</form:form>
	</div>
</body>
</html>