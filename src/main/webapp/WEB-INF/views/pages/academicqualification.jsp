<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../layout/headerJS.jsp" />

<header>
	<style>
		.dropdown:hover>.dropdown-menu {
			display: block;
		}
		
		.dropdown>.dropdown-toggle:active {
			/*Without this, clicking will make it sticky*/
			pointer-events: none;
		}
	</style>
</header>


<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<br/><br/><br/>

<h2 class="main-title-w3layouts mb-2 text-center text-white"
	style="padding-top: 20px">Academic Qualification Details</h2>
<!--// main-heading -->
<div
	class="form-body-w3-agile  w-lg-50 w-sm-75 w-100 mx-auto mt-5 col-md-8"
	style="padding-left: 10px">
	<c:if test='${Boolean.parseBoolean(success)}'>
		<div class="alert alert-success">${message}</div>
	</c:if>
	<c:if test='${Boolean.parseBoolean(error)}'>
		<div class="alert alert-danger">${message}</div>
	</c:if>
	<form action="academicqualificationRegistration" method="post">
		<div class="form-group">
			<label>Education Level</label> <input type="text" name="educationLevel"
				class="form-control" placeholder="Education Level" required="">
		</div>
		<div class="form-group">
			<label>Exam Title</label> <input type="text" name="examTitle"
				class="form-control" placeholder="Exam Title" required="">
		</div>
		<div class="form-group">
			<label>Major / Concentration</label> 
			<input type="text" name="concentration"
				class="form-control" placeholder="Concentration" required="">
		</div>
		<div class="form-group">
			<label>Institute</label> 
			<input type="text" name="institute"
				class="form-control" placeholder="Name of the Institute" required="">
		</div>
		

		<div class="form-group">
			<label>Result Type</label> 
			<select class="form-control" name="resultType">				
				<option value="CGPA">CGPA</option>
				<option value="Classic">Classic</option>				
			</select>
		</div>

		<div class="form-group">
			<label>Result</label> <input type="text" name="result"
				class="form-control" placeholder="Result" required="">
		</div>
		<div class="form-group">
			<label>Scale</label> <input type="text" name="scale"
				class="form-control" placeholder="Scale" required="">
		</div>
		<div class="form-group">
			<label>Duration</label> <input type="text" name="duration"
				class="form-control" placeholder="Duration" required="">
		</div>
		
		<button type="submit" class="btn btn-primary  mt-sm-5  px-4">Add Academic Qualification</button>
	</form>

</div>




<jsp:include page="../layout/footer.jsp" />