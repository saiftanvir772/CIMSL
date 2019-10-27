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


<h1 class="main-title-w3layouts mb-2 text-center text-white"
	style="padding-top: 20px">Training Details</h1>
<!--// main-heading -->
<div
	class="form-body-w3-agile  w-lg-50 w-sm-75 w-100 mx-auto mt-5 col-md-8" style="padding-left: 10px">
	<c:if test='${Boolean.parseBoolean(success)}'>
		<div class="alert alert-success">${message}</div>
	</c:if>
	<c:if test='${Boolean.parseBoolean(error)}'>
		<div class="alert alert-danger">${message}</div>
	</c:if>
	
	<table class="table">
		<thead>
			<tr>
				<td>Training Title</td>
				<td>Topic</td>
				<td>Institute</td>
				<td>Location</td>
				<td>Country</td>
				<td>Year</td>
				<td>Duration</td>
				<td>Certificate</td>
				<td>action</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="training" items="${trainingList}">
			<tr>
				<td>${training.trainingTitle}</td>
				<td>${training.topic}</td>
				
				<td>${training.institute}</td>
				<td>${training.location}</td>
				<td>${training.country}</td>
				<td>${training.year}</td>
				<td>${training.duration}</td>
				<td>${training.certificate}</td>
				<td>
					<a class="btn btn-success" href="/training/edit/${training.id}"><i class="fa fa-edit"></i></a>
					<a class="btn btn-danger" href="/training/delete/${training.id}"><i class="fa fa-trash"></i></a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

</div>




<jsp:include page="../layout/footer.jsp" />





