<html>
<head>
<%@ include file="./base.jsp"  %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"    %>
</head>
<body>

 <div class="container mt-12">
<div class="row">
<div class="col-md-6 offset-md-3">

<h1 class="text-center md-3" >welcome To S.COMPANY</h1>
 <table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">name</th>
      <th scope="col">job_role</th>
      <th scope="col">salary</th>
      <th scope="col">join_date</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${products}" var="p">
    <tr>
      
      <th scope="row">${p.id }</th>
      <td>${p.name}</td>
      <td>${p.job_role}</td>
      <td>${p.salary}</td>
           <td>${p.join_date}</td>
          
       
      
    
    </tr>
      </c:forEach>
    
  </tbody>
</table>
<div class="container text-center"  >
<a href="add" btn btn-outline-success>Add Employee Details</a>
</div>

</div>
</div>
</div>
 
</body>
</html>