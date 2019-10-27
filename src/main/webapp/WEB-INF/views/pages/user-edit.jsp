<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
	style="padding-top: 20px">Update User Information</h2>
<!--// main-heading -->
<div
	class="form-body-w3-agile  w-lg-50 w-sm-75 w-100 mx-auto mt-5 col-md-8" style="padding-left: 10px">
	<c:if test='${Boolean.parseBoolean(success)}'>
		<div class="alert alert-success">${message}</div>
	</c:if>
	<c:if test='${Boolean.parseBoolean(error)}'>
		<div class="alert alert-danger">${message}</div>
	</c:if>
	<form action="/updateUser" method="post">
		<div class="form-group">
			<label>First Name</label> 
			<input type="text" name="fName" class="form-control" value="${userEntity.firstName}"
				placeholder="Insert firstname" required="">
				
		</div>
		<div class="form-group">
			<label>Last Name</label> 
			<input type="text" name="lName" class="form-control" value="${userEntity.lastName}"
				placeholder="Insert lastname" required="">
		</div>
				
		<div class="form-group">
			<label>Email</label> 
			<input type="email" name="email" class="form-control" value="${userEntity.email}"
				placeholder="Insert Email " required="">
		</div>
		
		<div class="form-group">
			<label>User Name</label> 
			<input type="text" name="username" class="form-control" value="${userEntity.username}"
				placeholder="Insert Mobile No" required="">
		</div>
		
		
		
			<button type="submit" class="btn btn-primary  mt-sm-5  px-4">Update</button>
	</form>

</div>




<jsp:include page="../layout/footer.jsp" />





