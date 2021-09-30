<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
  <script src="./resources/js/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="./resources/js/bootstrap.min.js"></script>
</head>

<body>


    <div class="container-fluid">

    <form class="well form-horizontal" action="/submitHealthData" method="post"  id="Health_form">
<fieldset>

<!-- Form Name -->
<legend><center><h2><b>Health Issues</b></h2></center></legend><br>

<!-- ----------------------- -->
<!-- 
<form action="/action_page.php">
  <p>Please select your favorite Web language:</p>
  <input type="radio" id="html" name="fav_language" value="HTML">
  <label for="html">HTML</label><br>
  <input type="radio" id="css" name="fav_language" value="CSS">
  <label for="css">CSS</label><br>
  <input type="radio" id="javascript" name="fav_language" value="JavaScript">
  <label for="javascript">JavaScript</label> -->

<!-- ----------------------- -->

<!-- Text input-->
       
  <div class="form-group">

<label class="col-md-4 control-label"><p><b>Have you ever joined gym?</b></p></label>
<div class="col-md-4 inputGroupContainer">

<input type="radio" id="yes" name="joined_gym" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="joined_gym" value="NO">
  <label for="no">No</label><br></div>
</div>



 <div class="form-group">
<label class="col-md-4 control-label"><p><b>Do you have your instructor before?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="instructor_before" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="instructor_before" value="NO">
  <label for="no">No</label><br>

</div>
</div>
<div class="form-group">
<label class="col-md-4 control-label"><p><b>Do you need instructor?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="need_instructor" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="need_instructor" value="NO">
  <label for="no">No</label><br>

</div>
</div>
<div class="form-group">
<label class="col-md-4 control-label"><p><b>Any heart and stroke conditions?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="stroke_conditions" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="stroke_conditions" value="NO">
  <label for="no">No</label><br>

</div>
</div>
<div class="form-group">
<label class="col-md-4 control-label"><p><b>High Blood Pressure?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="Blood_Pressure" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="Blood_Pressure" value="NO">
  <label for="no">No</label><br>

</div>
</div>
<div class="form-group">
<label class="col-md-4 control-label"><p><b>Low Blood Pressure?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="lbp" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="lbp" value="NO">
  <label for="no">No</label><br>

</div>
</div>
<div class="form-group">
<label class="col-md-4 control-label"><p><b>Any breathing difficulties or asthma?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="asthma" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="asthma" value="NO">
  <label for="no">No</label><br>

</div>
</div>
<div class="form-group">
<label class="col-md-4 control-label"><p><b>Joint Problem?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="jp" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="jp" value="NO">
  <label for="no">No</label><br>
</div>
</div>

<div class="form-group">
<label class="col-md-4 control-label"><p><b>Any back pain problem?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="pp" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="pp" value="NO">
  <label for="no">No</label><br>
</div>
</div>
<div class="form-group">
<label class="col-md-4 control-label"><p><b>Do you have any surgery in last 6 months?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="6m" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="6m" value="NO">
  <label for="no">No</label><br>
</div>
</div>
 <div class="form-group">
<label class="col-md-4 control-label"><p><b>Are you taking prescribed medication?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="medi" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="medi" value="NO">
  <label for="no">No</label><br>
</div>
</div>
<div class="form-group">
<label class="col-md-4 control-label"><p><b>Do you have any medical conditions that should be made know?</b></p></label>
<div class="col-md-4 inputGroupContainer">
<input type="radio" id="yes" name="mc" value="Yes">
  <label for="yes">Yes</label><br>
<input type="radio" id="no" name="mc" value="NO">
  <label for="no">No</label><br>
</div>
</div>
<!-- Select Basic -->

<!-- Success message -->
<!--  <div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Success!.</div>-->

<!-- Button -->
<div class="form-group">
   <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
<!--     <button type="submit" class="btn btn-success" >Login</button>
 --> 
 				<td><input type="submit" value="DONE" /></td>
 
  </div>
   
</div>


</fieldset>
</form>
</div>
    </div><!-- /.container -->
</body>
</html>