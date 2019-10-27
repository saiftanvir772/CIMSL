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


<h2 class="main-title-w3layouts mb-2 text-center text-white"
	style="padding-top: 20px">Training Details</h2>
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
	<form action="/trainingRegistration" method="post">
		<div class="form-group">
			<label>Training Title</label> <input type="text" name="trainingTitle"
				class="form-control" placeholder="Training Title" required="">
		</div>
		<div class="form-group">
			<label>Topic of the Training</label> <input type="text" name="topic"
				class="form-control" placeholder="Topic of the Training" required="">
		</div>
		<div class="form-group">
			<label>Institute</label> 
			<input type="text" name="institute"
				class="form-control" placeholder="Name of the Institute" required="">
		</div>
		<div class="form-group">
			<label>Location</label> 
			<input type="text" name="location"
				class="form-control" placeholder="Name of the Institute" required="">
		</div>
		

		<div class="form-group">
			<label>Country</label> <input type="text" name="country"
				class="form-control" placeholder="Country" required="">
		</div>

		<div class="form-group">
			<label>Year</label> <input type="text" name="year"
				class="form-control" placeholder="Year" required="">
		</div>
		<div class="form-group">
			<label>Duration</label> <input type="text" name="duration"
				class="form-control" placeholder="Duration" required="">
		</div>
		<div class="form-group">
			<label>Certificate</label> <input type="text" name="certificate"
				class="form-control" placeholder="Certificate" required="">
		</div>
		<button type="submit" class="btn btn-primary  mt-sm-5  px-4">Add Training</button>
	</form>

</div>




<jsp:include page="../layout/footer.jsp" />