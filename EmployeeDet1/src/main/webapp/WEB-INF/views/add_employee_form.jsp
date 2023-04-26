<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"  %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>


</head>
<body>

<div class="container mt-3">
<div class="row">
<div class="col-md-6 offset-md-3">
<h1 class="text-center md-3">Fill The Employee Details</h1>

<form action="handle-Product" method="post">

<div class="form-group">
<label for="name">employee </label>
<input type="text" class="form-control"  name="name" 
aria-describedby="emailHelp" placeholder="enter the employee name">
</div>

<div class="form-group">
<label for="job_role">employee job_role</label>
<input type="text" class="form-control"  name="job_role" 
aria-describedby="emailHelp" placeholder="enter the employee role">
</div>

<div class="form-group">
<label for="salary">employee salary</label>
<input type="text" class="form-control"  name="salary" 
aria-describedby="emailHelp" placeholder="enter the employee salary">
</div>


<div class="form-group">
<label for="join_Date">employee join_Date</label>
<input type="text" class="form-control"  name="join_Date" 
aria-describedby="emailHelp" placeholder="enter the employee join_Date">
</div>

<div class="container text-center">

<a href="${pageContext.request.contextPath }/"   class="btn btn-outline-danger">back</a>

<button type="submit" class="btn btn-primary">add</button>

</div>

</form>



</div>


</div>



</div>


</body>
</html>