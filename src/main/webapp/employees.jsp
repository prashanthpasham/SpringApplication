<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row" style="margin-top:10%">
<div class="col-md-12">
<div class="col-md-3"></div>
<div class="col-md-6">

<table class="table table-bordered"  style="background-color:white">
<tr>
<th>EmployeeId</th>
<th>EmployeeName</th>
<th>Salary</th>
<th>Phoneno</th>
<th>Actions</th>
</tr>
<c:if test="${not empty emp}">
<c:forEach var="employeedetails" items="${emp}">
<tr>
<td>${employeedetails.empId}</td>
<td>${employeedetails.empName}</td>
<td>${employeedetails.salary}</td>
<td>${employeedetails.phone}</td>
<td><a href="editEmployee.do?empId=${employeedetails.empId}"><span class="glyphicon glyphicon-pencil"/></a>&nbsp; &nbsp;|&nbsp; &nbsp;
<a href="deleteEmployee.do?empId=${employeedetails.empId}" style="color:red"><span class ="glyphicon glyphicon-trash"/></a></td>
</tr>
</c:forEach>
</c:if>
</table>
</div>
<div class="col-md-3"></div>
</div>
</div>
