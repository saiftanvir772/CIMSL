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
	style="padding-top: 20px">Employment History</h2>
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
	<form action="employmenthistoryRegistration" method="post">
		<div class="form-group">
			<label>Company Name</label> <input type="text" name="companyName"
				class="form-control" placeholder="Company Name" required="">
		</div>
		<div class="form-group">
			<label>Business Type</label> <input type="text" name="businessType"
				class="form-control" placeholder="Business Type" required="">
		</div>
		<div class="form-group">
			<label>Designation</label> 
			<input type="text" name="designation"
				class="form-control" placeholder="Designation" required="">
		</div>
		<div class="form-group">
			<label>Department</label> 
			<input type="text" name="department"
				class="form-control" placeholder="Name of the Department" required="">
		</div>
		

		<div class="form-group">
			<label>Expertise</label> 
			<input type="text" name="expertise"
				class="form-control" placeholder="Expertise" required="">
		</div>

		<div class="form-group">
			<label>Responsibilities</label> 
			<input type="text" name="responsibilities"
				class="form-control" placeholder="Responsibilities" required="">
		</div>
		<div class="form-group">
			<label>Location</label> <input type="text" name="location"
				class="form-control" placeholder="Location" required="">
		</div>
		<div class="form-group">
			<label>Start Date</label> <input type="date" name="startDate"
				class="form-control" required="">
		</div>
		<div class="form-group">
			<label>End Date</label> <input type="date" name="endDate"
				class="form-control" required="">
		</div>
		<button type="submit" class="btn btn-primary  mt-sm-5  px-4">Add Employment History</button>
	</form>

</div>




<jsp:include page="../layout/footer.jsp" />