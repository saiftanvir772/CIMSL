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
	style="padding-top: 20px">Language Skill and Specialization</h2>
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
	<form action="languageSkillandspecializationRegistration" method="post">
		<div class="form-group">
			<label>Name of the Language</label> <input type="text" name="languageName"
				class="form-control" placeholder="Language Name" required="">
		</div>
		<div class="form-group">
			<label>Reading Status</label> 
			<select class="form-control" name="reading">
				<option value="Native">Native</option>
				<option value="Good">Good</option>
				<option value="Fair">Fair</option>
				<option value="Poor">Poor</option>
			</select>
		</div>
		<div class="form-group">
			<label>Writing Status</label> 
			<select class="form-control" name="writing">
				<option value="Native">Native</option>
				<option value="Good">Good</option>
				<option value="Fair">Fair</option>
				<option value="Poor">Poor</option>
			</select>
		</div>
		<div class="form-group">
			<label>Speaking Status</label> 
			<select class="form-control" name="speaking">
				<option value="Native">Native</option>
				<option value="Good">Good</option>
				<option value="Fair">Fair</option>
				<option value="Poor">Poor</option>
			</select>
		</div>
		

		<div class="form-group">
			<label>Specialization</label> 
			<input type="text" name="specializationName"
				class="form-control" placeholder="Specialization" required="">
		</div>

		<div class="form-group">
			<label>Proficiency</label> 
			<input type="text" name="proficiency"
				class="form-control" placeholder="Proficiency" required="">
		</div>
		
		<button type="submit" class="btn btn-primary  mt-sm-5  px-4">Add Skill and Specialization</button>
	</form>

</div>




<jsp:include page="../layout/footer.jsp" />